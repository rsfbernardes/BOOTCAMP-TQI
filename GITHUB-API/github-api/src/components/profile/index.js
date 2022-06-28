import React from 'react'
import useGithub from '../../hooks/github-hooks'
import UserStatus from '../userStatus'
import * as Styled from './styled'

function Profile() {

    const { githubState } = useGithub()

    return (
        <Styled.WrapperProfile>
            <Styled.ProfilePhoto>
                <img src="https://avatars.githubusercontent.com/u/61915671?v=4" alt="Avatar of user" />
            </Styled.ProfilePhoto>
            <Styled.ProfileData>
                <h1>{ githubState.user.name }</h1>
                <h4>Username:
                    <a href={ githubState.user.html_url} target="_blank" rel="noopener noreferrer">{ githubState.user.login}</a>
                </h4>
                <h4>Company:
                    <span>{ githubState.user.company }</span>
                </h4>
                <h4>location:
                    <span>{ githubState.user.location }</span>
                </h4>
                <h4>Blog:
                    <a href="http://" target="_blank" rel="noopener noreferrer">{ githubState.user.blog }</a>
                </h4>
                <UserStatus />
            </Styled.ProfileData>
        </Styled.WrapperProfile>
    )
}

export default Profile
