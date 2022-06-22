import React from 'react'
import UserStatus from '../userStatus'
import * as Styled from './styled'

function Profile() {
    return (
        <Styled.WrapperProfile>
            <Styled.ProfilePhoto>
                <img src="https://avatars.githubusercontent.com/u/61915671?v=4" alt="Avatar of user" />
            </Styled.ProfilePhoto>
            <Styled.ProfileData>
                <h1>Rodrigo Bernardes</h1>
                <h4>Username:
                    <a href="https://github.com/rsfbernardes" target="_blank" rel="noopener noreferrer">rsfbernardes</a>
                </h4>
                <h4>Company:
                    <span>TQI</span>
                </h4>
                <h4>location:
                    <span>Uberlândia</span>
                </h4>
                <h4>Blog:
                    <a href="http://" target="_blank" rel="noopener noreferrer">http://blog.com</a>
                </h4>
                <UserStatus />
            </Styled.ProfileData>
        </Styled.WrapperProfile>
    )
}

export default Profile
