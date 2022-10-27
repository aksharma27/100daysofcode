import React from 'react'
import { useEffect } from 'react';
import './App.css';
import SearchIcon from './search.svg';
import MovieCard from './MovieCard';
import { useState } from 'react';

//12b2bb64

const API_URL = 'https://www.omdbapi.com/?i=tt3896198&apikey=12b2bb64';
// const movie1 = {
//     "Title": "Spider-Man Title Reveal",
//     "Year": "2021",
//     "imdbID": "tt14122734",
//     "Type": "movie",
//     "Poster": "https://m.media-amazon.com/images/M/MV5BNjRjMmQ2NDQtNmI5NC00N2EwLTkwYWQtOTM2OGZjMmI5YmRjXkEyXkFqcGdeQXVyMTI0NTA1MDI3._V1_SX300.jpg"
// }

const App = () => {

    const [movies, setMovies] = useState([]);
    const [search, setSearch] = useState('');


    const searchMovies = async (title) => {
        const response = await fetch(`${API_URL}&s={title}}`);
        const data = await response.json();

        setMovies(data.Search);
    }

    useEffect(() => {
        searchMovies('Iron')
    }, []);

    return (
        <div className="app">
            <h1>VegaMovies</h1>

            <div className="search">
                <input placeholder="Search Movies" value={search}
                    onChange={(e) => setSearch(e.target.value)} />

                <img src={SearchIcon} alt="Search"
                    onClick={() => searchMovies(search)} />      {/*onclick to use svg as a button*/}
            </div>

            {
                movies?.length > 0
                    ? (
                        <div className="container">
                            {movies.map((movie) => (
                                <MovieCard movie={movie} />
                            ))}
                        </div>
                    ) : <div className='empty'>
                        <h2>No Movies found</h2>
                    </div>

            }



        </div>
    );
}
export default App
