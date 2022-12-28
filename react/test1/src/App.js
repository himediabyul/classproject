import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';
import Notification from './components/Notification';
import Counter from './components/Counter';
import TextInputButton from './components/TextInputButton';
import Acommodate from './components/Acommodate';
import Toggle from './components/Toggle';
import MyButton from './components/MyButton';
import ConfirmButton from './components/ConfirmButton';
import Greeting from './components/Greeting';
import LoginControl from './components/LoginControl';
import MailBox from './components/MailBox';
import UserStatus from './components/UserStatus';
import WarningBanner from './WarningBanner';
import Mainpage from './components/Mainpage';
import NumberList from './components/NumberList';
import TeamPlayers from './components/TeamPlayers';
import NameForm from './components/NameForm';
import RequestForm from './components/RequestForm';
import FruitSelect from './components/FruitSelect';
import Reservation from './components/Reservation';
import Signup from './components/Signup';
import WelcomeMessage from './components/WelcomeMessage';
import WelcomeDialog from './components/WelcomeDialog';
import SignUpDialog from './components/SignUpDialog';
import ProfileCard from './components/ProfileCard';
import DarkOrWhite from './components/DarkOrWhite';
import ProductList from './components/ProductList';


/* let list = [{},{},{},{},{},{},{},{}]
<MailBox unReadMessage={list}/> */


function App() {
  return (
    <ProductList />
  );
}


{/* <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React 1234
        </a>
      </header>
    </div> */}

export default App;