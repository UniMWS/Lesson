05.02.2023
---
## lesson13

### Внедрение системы контроля версий

#### Инициализация Git в выбранной папке
	
>***Чтобы завёлся, а не сломался branch main***
```java
		git init
		# настроить файлик .gitignore
		git add .gitignore
		git status
		git commit -m "Initial commit"
		git status
		git log --oneline --graph
		git branch
```
#### .gitignore
> Можете пересоздать проект заново, добавив гитигнор до инициализации гита, или воспользоваться командой для удаления файлов, папок из отслеживания
> Например вот:
> `git rm -r -f .idea` удалит из отслеживания папку .idea и всё её содержимое

#### Удалённые репозитории
	
1. Операция git clone позволяет нам склонировать удалённый репозиторий. После успешной операции клонирования, создастся каталог demo, в котором будет наш репозиторий (уже привязанный к удалённому).
```java
git clone https://github.com/netology-git/demo.git
cd demo/
```
2. Рассмотрим второй вариант, когда у нас уже есть локальный репозиторий с проектом, и мы хотим к нему подключить удалённый.
```java
git remote add origin https://github.com/netology-git/demo.git
```
3. Команда git remote позволяет нам управлять удалёнными репозиториями (добавлять, удалять, просматривать). Например, мы можем в только что склонированном репозитории посмотреть remote:
```java
git remote -v
```
> **Что делает `git branch -M main` в `Git`?**
> Открываем доку [https://git-scm.com/docs/git-branch](https://git-scm.com/docs/git-branch) и читаем
```java
-M
Shortcut for --move --force.
```
То есть это просто заменяет эти два параметра. Первый параметр помогает **переименовать ветку**, второй подавляет ряд "ошибок" - например, ветка существует.

Зачем нужна прям эта команда ? А это популярное сейчас переименование `master` в `main`, так как некоторым кажется, что `master` обидное. Ок, пусть будет.

>***Общепринято, что первый удалённый репозиторий называют origin.***
	
4. для первой отправки: 
```java
git push -u origin main
```

5. git pull origin main --no-rebase
+ это про конфликты и Merge (см. урок 14)
+ https://habr.com/ru/post/161009/

6. git push --set-upstream origin main
+ https://ru.hexlet.io/topics/52170
+ Выполнив эту команду один раз с флагом --set-upstream или сокращенно -u , например так git push --set-upstream origin main, вы сделаете удаленную ветку main репозитория origin отслеживаемой. 

---
[*мои конспекты*](./README.md)
