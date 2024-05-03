import logo from './logo.svg';
import './App.css';
import BasicLayout from './layout/BasicLayout';
import { Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Contact from './pages/Contact';
import About from './pages/About';

function App() {
  return (
    <div className="App">
      <BasicLayout>
        <Routes>
          <Route path='/' element={<Home></Home>}></Route>
          <Route path='/about' element={<About></About>}></Route>
          <Route path='/contact' element={<Contact></Contact>}></Route>
        </Routes>
      </BasicLayout>
    </div>
  );
}

export default App;
