import PropTypes from "prop-types"

function Properties(props) {

    const { array, bool, func, numb, obj, str } = props

    return (
    <>
        <h1>Typechecking with PropTypes</h1>
        <h3>boolean: {bool}</h3>
        <h3>function: {func}</h3>
        <h3>number: {numb}</h3>
        <h3>object: {obj}</h3>
        <h3>string: {str}</h3>
        <h3>array: {array}</h3>
    </>
    )
}

Properties.defaultProps = {
    numb: 8,
    string: 'React Typechecking',
}

Properties.propTypes = {
    bool: PropTypes.bool.isRequired,
    func: PropTypes.func.isRequired,
    number: PropTypes.number,
    object: PropTypes.object.isRequired,
    string: PropTypes.string,
    array: PropTypes.array.isRequired,
}

    export default Properties
