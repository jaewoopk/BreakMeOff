// App.js
import React, { useState } from 'react';
import MainContainer from './components/MainContainer/index.tsx';

function App() {
  return <MainContainer/>
  // const [loggedInUser, setLoggedInUser] = useState(null);
  //
  // const handleLogin = (username) => {
  //   setLoggedInUser(username);
  // };
  //
  // return (
  //     <div className="App">
  //       {loggedInUser ? (
  //           <RegisterPage user={loggedInUser} />
  //       ) : (
  //           <LoginPage onLogin={handleLogin} />
  //       )}
  //     </div>
  // );
}

export default App;
