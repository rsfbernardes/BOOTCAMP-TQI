import { Component } from 'react'
import Layout from "./Layout"


class App extends Component {
  state = {
    changed: true
  }

  constructor() {
    super();
    console.log("ComponentDidMount was discontinued. I´m now in the class constructor")
    console.log(this.state.changed)
  }

  componentDidCatch(error, info) {
    console.log("componentDidCatch", { error, info })
    console.log(this.state.changed)
  }

  componentDidUpdate(prevProps, prevState) {
    console.log("componentDidUpdate", {
      currentState: this.state,
      prevProps,
      prevState,
    })
    console.log(this.state.changed)
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log("shouldComponentUpdate",{
      currentState: this.state,
      nextProps,
      nextState,
    })
    console.log(this.state.changed)

    return true
  }

  handleClick = () => {
    this.setState({
      changed: false
    })
    console.log('clicked')
    console.log(this.state.changed)
  }

  componentWillUnmount() {
    console.log("componentWillUnmount")
    console.log("removeAddEventListener")
    document.removeEventListener('click', this.handleClick)
    console.log(this.state.changed)
  }

  componentDidMount() {
    console.log("ComponentDidMount")
    console.log("addEventListener")
    document.addEventListener('scroll', this.handleScroll)
    console.log(this.state.changed)
  }

  render() {
    return (
      <>
        <button onClick={this.handleClick}>Render</button>
        {this.state.changed === true && <Layout />}
      </>
    )
  }
}

export default App;
