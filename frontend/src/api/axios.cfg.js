import axios from 'axios'

const api = axios.create({
    withCredentials: true,
    baseURL: process.env.REACT_APP_API_URL // тут берется базовый адрес сервера и применяется ко всем запроса, чтоб сократить запись самих запросов
})

api.interceptors.request.use((config) => {
    config.headers.authorization = `${localStorage.getItem('Token')}`
    return config
    // тут задаешь параметры запроса, сверху пример как привязать заголовок типа авторизации
})

api.interceptors.response.use((config) => {
    // тут пишешь логику отлова ошибок по кодам
})


export default api