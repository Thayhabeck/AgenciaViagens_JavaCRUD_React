import {BrowserRouter} from 'react-router-dom';
import Nav from './components/Nav';
import Routes from './Routes';
import Footer from './components/Footer';


function App() {
  return (
    <BrowserRouter>
      <Nav />
      <Routes />
      <Footer />
    </BrowserRouter>
  );
}

export default App;
