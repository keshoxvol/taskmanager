import api from '../axios.cfg'

export const GetAll = async () => {
    let res = await api.get(`task/all`)
    return res.data
}
