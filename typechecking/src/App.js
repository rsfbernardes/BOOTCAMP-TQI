import Properties from "./Properties";

function App(props) {

  function anyFunc() {
    console.log("i'm a function")
  }

  return (
    <Properties 
      booleanValue={true}
      functionValue={anyFunc}
      obj={ {
        property: "value",
      } }
      arr={ [0, 1, 2, 3] }
    />
  );
}

export default App;
