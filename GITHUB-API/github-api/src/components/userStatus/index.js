import React from 'react'
import useGithub from '../../hooks/github-hooks'
import * as Styled from './styled'

function UserStatus() {

  const { githubState } = useGithub()

  return (
    <Styled.WrapperUserStatus>
      <div>
        <h4>Followers</h4>
        <span>{ githubState.user.followers }</span>
      </div>
      <div>
        <h4>Followings</h4>
        <span>{ githubState.user.followings }</span>
      </div>
      <div>
        <h4>Repos</h4>
        <span>{ githubState.user.public_repos }</span>
      </div>
      <div>
        <h4>Gists</h4>
        <span>{ githubState.user.public_gists }</span>
      </div>

    </Styled.WrapperUserStatus>
  )
}

export default UserStatus
