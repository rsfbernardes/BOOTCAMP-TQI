import React from 'react'
import  * as Styled from './styled'

function RepositoriesItem({ name, linkToRepo, fullName }) {
  return (
    <Styled.RepositoriesItem>
        <h2>{name}</h2>
        <h4>Full Name:</h4>
        <a href={linkToRepo} target="_blank" rel="noopener noreferrer">{fullName}</a>
    </Styled.RepositoriesItem>
  )
}

export default RepositoriesItem
