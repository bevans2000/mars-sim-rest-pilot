import { BrowserRouter as Router, Redirect, Route, Switch } from 'react-router-dom';
import NotFound from './NotFound';
import PersonTable from './person/PersonTable';
import PersonDetails from './person/PersonDetails'
import SettlementDetails from './settlement/SettlementDetails';
import SettlementTable from './settlement/SettlementTable';
import SimNavBar from './Navbar'; 

function App() {
  return (
    <Router>
      <div className="App">
        <SimNavBar />
        <div className="content">
          <Switch>
            <Route exact path="/">
              <Redirect to="/persons" />
            </Route>
            <Route path="/persons">
              <PersonTable />
            </Route>
            <Route path="/settlements">
              <SettlementTable />
            </Route>
            <Route path="/person/:id">
              <PersonDetails />
            </Route>
            <Route path="/settlement/:id">
              <SettlementDetails />
            </Route>
            <Route path="*">
              <NotFound />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  );
}

export default App;
