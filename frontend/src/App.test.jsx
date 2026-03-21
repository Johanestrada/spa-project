import { render, screen } from '@testing-library/react';
import App from './App';
import { describe, it, expect } from 'vitest';

describe('App', () => {
  it('renderiza el título SPA relax', () => {
    render(<App />);
    
    const titulo = screen.getByText(/spa relax/i);
    
    expect(titulo).toBeDefined();
  });
});