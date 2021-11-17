# taskmanager

Сервис решает задачи хранения заметок, задач, статей, моделей действий, документов, файлов. Позволяет внутри себя менять форму представления информации налету.

1) Хранение задач для одного человека
2) Добавление проектов и пользователей
3) Добавление заметок и преобразования задачи в заметку и обратно
4) Сохранение отчетности по задачам
5) Добавление представлений данных в форматах(список, канбан, куча)
6) Добавление телеграм менеджера
7) Внедрение системы гтд
8) Добавление хранения моделей действий
9) Добавление конструирования сложных систем из моделей


endpoints:

/sys
  /defaultvaluesinStatus
  /defaultvaluesinImportanceStatus

/task
  /add
  /deleteall
  /deletebyid
  /bystatus
  /buimportancestatus
  /all

/status
  /all

/importancestatus
  /all


/Company
  /add
  /getowner
  /getmembership
  /getdepartments

/Department
  /add
  /getmanager
  /getmembership
  /getprojects

/Project
  /add
  /getmanager
  /getmembership
  /gettasks

/Customer
  /add
  /getbyid
  

