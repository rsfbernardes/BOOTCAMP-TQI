import React from 'react'
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
      <Styled.WrapperTabPanel>Repositories</Styled.WrapperTabPanel>
      <Styled.WrapperTabPanel>Starred</Styled.WrapperTabPanel>
    </Styled.WrapperTabs>
  )
}

export default Repositories
