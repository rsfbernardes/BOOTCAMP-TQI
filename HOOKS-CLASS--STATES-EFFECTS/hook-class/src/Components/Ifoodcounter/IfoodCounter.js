import React, { useState, useEffect } from 'react'
import '../Ifoodcounter/IfoodCounter.css'

export default function IfoodCounter() {

    const [value, setValue] = useState(1)
    const [buttonClass, setButtonClass] = useState('counter-button-minus-active')

    useEffect(() => {
        document.getElementById('total').innerHTML = value * 5.00
    },[value])

    function increase() {
        setValue(value + 1)
        setButtonClass('counter-button-minus-active')
    }

    function decrease() {

        if (value <= 1) {
            setButtonClass('counter-button-minus-desactive')
        }

        if (value > 0) {
            setValue(value -1)   
        }
    }

    return (
        <div className='counter-wrapper'>
            <button
                className={buttonClass}
                onClick={decrease}
            >
                -
            </button>
            <p>{value}</p>
            <button
                className='counter-button-plus-active'
                onClick={increase}
            >
                +
            </button>
            <button id='total'>0,00</button>
        </div>
    )
}
