import React from 'react'
import * as Styled from './styled'

function Profile() {
    return (
        <Styled.WrapperProfile>
            <Styled.ProfilePhoto>
                <img src="https://avatars.githubusercontent.com/u/61915671?v=4" alt="Avatar of user" />
            </Styled.ProfilePhoto>
            <Styled.ProfileData>
                <div>Rodrigo Bernardes</div>
                <div>Username:</div>
                <span>rsfbernardes</span>
                <div>location: </div>
                <span>Uberlândia</span>
                <div>Bio: </div>
                <span>I'm from Brazil, married, father of a girl.\r\nPassionate about sports and programming</span>
            </Styled.ProfileData>
        </Styled.WrapperProfile>
    )
}

export default Profile
