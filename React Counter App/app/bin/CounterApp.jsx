import React, { useState } from 'react';

const CounterApp = () => {
  const [count, setCount] = useState(0);

  const handleIncrement = () => setCount(count + 1);
  const handleDecrement = () => setCount(count - 1);

  return (
    <div style={styles.container}>
      <h1>React Counter</h1>
      <h2>{count}</h2>
      <button onClick={handleIncrement} style={styles.button}>Increment</button>
      <button onClick={handleDecrement} style={styles.button}>Decrement</button>
    </div>
  );
};

const styles = {
  container: {
    textAlign: 'center',
    padding: '20px',
    fontFamily: 'Arial, sans-serif'
  },
  button: {
    margin: '10px',
    padding: '10px 20px',
    fontSize: '16px',
    cursor: 'pointer'
  }
};

export default CounterApp;
