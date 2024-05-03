import React, { useEffect } from 'react';
import { getLottoNumber } from '../api/home/homePageApi';


const Home = () => {
    const initData = {
        "drwtno1": 11
    };
    useEffect(() => {
        getLottoNumber();
    }, []);

    return (
        <div>
            <h1>Home</h1>
            <h2>첫번째 번호{initData.drwtno1}</h2>
        </div>
    );
}

export default Home;