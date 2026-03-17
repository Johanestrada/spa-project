import { useEffect, useState } from "react"

function App() {
  const [planes, setPlanes] = useState([])
  const [error, setError] = useState(null)
  const [Loading, setLoading] = useState(true)

  useEffect(()=>{
    fetch("http://localhost:8080/api/planes").then(resp=>{
      if(!resp.ok) throw new error("Error al obtener plan")
      return resp.json()
    }).then(data=>{
      setPlanes(data)
      setLoading(false)
    }).catch(err=>{
      setError(err.message)
      setLoading(false)
    })
  },[])

  return (
    <div>
      <h1>SPA relax</h1>

      {Loading && <p>Cargando planes</p>}
      {error && <p>Error: {error} </p>}

      <ul>
        {planes.map(plan=>(
          <li key={plan.id}>
            <h3>{plan.nombre}</h3>
            <p>{plan.descripcion}</p>
            <strong>{plan.precio}</strong>
          </li>
        ))}
      </ul>
    </div>
  )
}

export default App