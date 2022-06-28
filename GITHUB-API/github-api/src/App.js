import Layout from "./components/layout";
import Input from "./components/input";
import Profile from "./components/profile";
import Repositories from "./components/repositories";
import UserStatus from "./components/userStatus";
import GithubProvider from "./providers/github-provider";

function App() {
  return (
    <main>
      <GithubProvider>
        < Layout>
          <Input />
          <Profile >
            <UserStatus />
          </Profile>
          <Repositories />
        </ Layout >
      </GithubProvider>
    </main>
  );
}

export default App;
