import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import AboutPage from './pages/AboutPage';
import DummyObjectivePage from './pages/DummyObjectivePage';

function App() {
  return (
    <BrowserRouter>
      <Route exact path="/" component={HomePage} />
      <Route exact path="/about" component={AboutPage} />
      <Route exact path="/dummy_objective" component={DummyObjectivePage} />
    </BrowserRouter>

  );
}

export default App;
