import React from 'react'
import * as Styled from './styled'

function UserStatus() {
  return (
    <Styled.WrapperUserStatus>
      <div>
        <h4>Followers</h4>
        <span>0</span>
      </div>
      <div>
        <h4>Followings</h4>
        <span>1</span>
      </div>
      <div>
        <h4>Repos</h4>
        <span>26</span>
      </div>
      <div>
        <h4>Gists</h4>
        <span>50</span>
      </div>

    </Styled.WrapperUserStatus>
  )
}

export default UserStatus
