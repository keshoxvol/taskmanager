export const Company = ({data}) =>{
    return (
        <div className='company__case'>
            <h3>{data.title}</h3>
            <ul className='company__members'>
                <li><img src="" alt="" /></li>
            </ul>
            <ul className='company__projects'>
                <li><p></p><img src="" alt="" /></li>
            </ul>
        </div>
    )
}