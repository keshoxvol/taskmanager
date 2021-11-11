import api from '../axios.cfg'

export const Check_avatar = async ( id ) => {
    return await api.get(`static/${id}.webp`)
}

export const Registration = async ( Form ) => {
    return await api.post(`/api/user/registration`, { ...Form })
}

export const Update_user = async ( Form ) => {
    return await api.put(`/api/user/user_update`, { ...Form })
}

export const DeleteAvatar = async (id) => {
    return await api.delete(`/api/user/avatar?id=${id}`)
}
