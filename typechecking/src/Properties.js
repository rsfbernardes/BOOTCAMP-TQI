import PropTypes from "prop-types"

function Properties(props) {

    const { booleanValue, functionValue, numb, obj, str, arr } = props

    return (
    <>
        <h1>Typechecking with PropTypes</h1>
        <h3>boolean: <span id="booleanValue">{booleanValue}</span></h3>
        <button onClick={functionValue}>function </button>
        <h3>number: {numb}</h3>
        <h3 >object: {obj.property}</h3>
        <h3>string: {str}</h3>
        <h3>array: {arr}</h3>
    </>
    )
}

Properties.defaultProps = {
    numb: 8,
    str: "React Typechecking",
  }
  
  Properties.propTypes = {
    booleanValue: PropTypes.bool.isRequired,
    functionValue: PropTypes.func.isRequired,
    numb: PropTypes.number,
    obj: PropTypes.shape({
        property: PropTypes.string.isRequired,
    }).isRequired,
    str: PropTypes.string,
    arr: PropTypes.array.isRequired,
  }

    export default Properties
