// App.js
import React, { useState } from 'react';
import LoginPage from './LoginPage';
import RegisterPage from "./RegisterPage";

function App() {
  const [loggedInUser, setLoggedInUser] = useState(null);

  const handleLogin = (username) => {
    setLoggedInUser(username);
  };

  return (
      <div className="App">
        {loggedInUser ? (
            <RegisterPage user={loggedInUser} />
        ) : (
            <LoginPage onLogin={handleLogin} />
        )}
      </div>
  );
}

export default App;
