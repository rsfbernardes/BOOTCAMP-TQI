import Layout from "./components/layout";
import Input from "./components/input";
import Profile from "./components/profile";
import Repositories from "./components/repositories";
import UserStatus from "./components/userStatus";

function App() {
  return (
    <main>
      < Layout>
        <Input />
        <Profile >
          <UserStatus />
        </Profile>
        <Repositories />
      </ Layout >
    </main>
  );
}

export default App;
