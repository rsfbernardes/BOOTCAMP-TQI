import styled from "styled-components";
import { Tabs, TabList, Tab, TabPanel } from 'react-tabs'

export const WrapperTabs = styled(Tabs)`

    font-size: 24px;
`

export const WrapperTabList = styled(TabList)`

    display: flex;
    margin-bottom: 0;
    padding: 0;
`

export const WrapperTab = styled(Tab)`

    list-style: none;
    margin-right: 10px;
    border: 1px dotted gray;
    border-radius: 8px;
    padding: 5px;
    user-select: none;
    cursor: pointer;

    &:focus {
        box-shadow: 0 0 0.4em gray;
        outline: none;
    }
`

export const WrapperTabPanel = styled(TabPanel)`

    padding-left: 5px;
    min-height: 40vh;
    display: none;

    &.is-selected {
        display: inline-block;
    }
`
