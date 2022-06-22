import styled from 'styled-components'

export const WrapperProfile = styled.div`

    display: flex;
    align-items: flex-start;
    justify-content: flex-start;
    font-size: 18px;
    margin: 0 8px;
    font-family: sans-serif;
    font-weight: bold;
`

export const ProfilePhoto = styled.div`

    margin-right: 24px;
    
    && img {
        border-radius: 50%;
        width: 200px;
        height:200px;
    }
`

export const ProfileData = styled.div`

    display: flex;
    flex-direction: column;
    padding: 0 0 0 10px;

    && span {
       font-weight: normal;
       margin-left: 5px;
    }

    && h1 {
        margin: 0 0 5px 0;
    }

    && h4 {
        margin: 2.5px 0 0 0;
    }

    && a {
        text-decoration: none;
        margin-left: 5px;
        color: blue;
    }
`