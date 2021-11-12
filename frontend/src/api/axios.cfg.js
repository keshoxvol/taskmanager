import axios from 'axios'

const api = axios.create({
    baseURL: process.env.REACT_APP_API_URL
})

// api.interceptors.request.use((config) => {
//     // тут задаешь параметры запроса, сверху пример как привязать заголовок типа авторизации
// })

// api.interceptors.response.use((config) => {
//     // тут пишешь логику отлова ошибок по кодам
// })


export default api