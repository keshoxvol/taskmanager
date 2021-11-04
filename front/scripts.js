async function getResponse() {
    let response = await fetch('http://localhost:8080/gettasks')
    let content = await response.json()
    content = content.splice(0, 30)

    let list = document.querySelector('.posts')

    let key;
    for (key in content) {
        let status
        if (content[key].status === 1) {
            status = "Ожидание"
        } else if ((content[key].status === 3)) {
            status = "Выполнено"
        } else if ((content[key].status === 2)) {
            status = "В работе"
        } else if ((content[key].status === 0)) {
            status = "Архив"
        }

        list.innerHTML += `
            <li class=post>
                <h4><a href="#openModalPost${content[key].title}">${content[key].title} | ${status}</a></h4>
                <div id="openModalPost${content[key].title}" class="modal">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div>
                                <div class="modal-header">
                                    <h3 class="modal-title">${content[key].title}</h3>
                                    <form action="http://localhost:8080/donetask" method="post">
                                        <button type="submit" name="taskid" value="${content[key].id}">Завершить</button>    
                                    </form>
                                    <a href="#close" title="Close" class="close">×</a>
                                </div>
                                <div class="modal-body">
                                    <div>Статус: ${status}</div>
                                    <div>Тэг: ${content[key].tag}</div>
                                    <div>Описание: ${content[key].description}</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </li>
            `
        console.log(content[key])
    }
}
getResponse()