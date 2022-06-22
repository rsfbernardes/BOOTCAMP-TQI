import React from 'react'
import RepositoriesItem from '../reposytories-item'
import * as Styled from './styled'

function Repositories() {
  return (
    <Styled.WrapperTabs
      selectedTabClassName='is-selected'
      selectedTabPanelClassName='is-selected'
    >
      <Styled.WrapperTabList >
        <Styled.WrapperTab >Repositories</Styled.WrapperTab>
        <Styled.WrapperTab >Starred</Styled.WrapperTab>
      </Styled.WrapperTabList>
      <Styled.WrapperTabPanel>
        <RepositoriesItem
          name="30-seconds-of-code"
          linkToRepo="https://github.com/rsfbernardes/30-seconds-of-code"
          fullName="rsfbernardes/30-seconds-of-code"
        />
      </Styled.WrapperTabPanel>
      <Styled.WrapperTabPanel>
        <RepositoriesItem
          name="benits"
          linkToRepo="https://github.com/benits/benits"
          fullName="benits/benits"
          />
      </Styled.WrapperTabPanel>
    </Styled.WrapperTabs>
  )
}

export default Repositories
