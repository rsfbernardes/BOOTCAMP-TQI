function Counter() {
    let quantity = 10;

    function increaseQuantity() {
        quantity++;
        document.getElementById("counter-box").innerHTML = quantity;
        console.log(quantity)
      }

    return(
        <> 
            <h1 id="counter-box">{quantity}</h1>
            <button onClick={increaseQuantity}>Increase</button>
        </>
    )
}

export default Counter;