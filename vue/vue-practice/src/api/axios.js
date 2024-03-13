import axios from 'axios'

const BASE_URL = 'http://localhost:3000/'

export default  {    
    getURL: (URL) => {
        const final_URL = URL.startsWith('http') ? URL : BASE_URL + URL
        
        return axios.get(final_URL)
    }
}