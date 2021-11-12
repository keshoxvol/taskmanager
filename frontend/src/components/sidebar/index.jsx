import { useState } from "react"
import { Company } from "../company"

export const Sidebar = () => {

    const [ dataCompany, setDataCompany ] = useState([
        {
            title: 'Codovstvo',
            members: [

            ],
            projects: [
                {
                    title: '',
                    status: true
                },
                {
                    title: '',
                    status: true
                }
            ]
        },
        {
            title: 'Codovstvo',
            members: [
                
            ],
            projects: [
                {
                    title: '',
                    status: true
                },
                {
                    title: '',
                    status: true
                }
            ]
        },
        {
            title: 'Codovstvo',
            members: [
                
            ],
            projects: [
                {
                    title: '',
                    status: true
                },
                {
                    title: '',
                    status: true
                }
            ]
        }
    ])

    return (
        <section id='sidebar'>
            <div className='top__case'></div>
            <nav>
                <ul>
                    <li>Home</li>
                    <li>My Tasks</li>
                </ul>
            </nav>
            <div id='companies'>
                {dataCompany.map(e => <Company data={e} />)}
            </div>
        </section>
    )
}