07.02.2023
---
## lesson15

### 👬 Командная работа

	15.1		Удаленные ветки

```java
git init
git status
git add .gitignore
git add *
git commit -m "Initial commit"
git log --oneline --graph
git checkout -b feature/jdcp6
git commit -a -m "Change name JDCP-6"
git checkout main
git remote add origin https://github.com/UniMWS/Lesson.git
git push --all
cd ..
git clone https://github.com/UniMWS/Lesson.git Lesson-copy
cd Lesson-copy/
git branch
git branch --all
#остальные ветки создавать git branch <local-branch> <origin/remote-branch>
#сокращенная спец команда для соответствия имени git checkout --track <remote-branch>
git checkout --track origin/feature/jdcp6
#возвращаемся в оригинал
cd ..
cd Lesson
git commit -a -m "modified README.md"
git push
git log --oneline
# push, fetch, pull
#get fetch <origin> забирает изменения с удаленного и сдвигает указатели удаленной ветки на нужную позицию.
#fetch работает в активном branch
git checkout -b feature/sample
#используем грамм линукса для ускорения
mkdir Sample
touch sample/sample.md
echo "nameserver 8.8.8.8" >> sample/sample.md
cat sample/sample.md
git add *
git status
git commit -m "Sample added"
# так как ветки еще нет в Github, то -u origin
git push -u origin feature/sample
# типа второй компьютер
cd ..
git clone https://github.com/UniMWS/Lesson.git Lesson-copy2
cd Lesson-copy2/
echo "nameserver 1.1.1.1" > sample/sample.md
echo "nameserver 8.8.8.8" >> sample/sample.md
cat Sample/sample.md
git commit -a -m "in sample added 2 dns"
git push
# на первый компьютер - добавим другой второй dns
echo "nameserver 8.8.4.4" >> sample/sample.md
cat Sample/sample.md
git commit -a -m "sample add dns 2"
git push
#конфликт
# как получить конфликтные расхождения?
# git fetch позволяет получить удаленные изменения не меняя файлы в workong directory, останется потом merge
git fetch
git status
git checkout origin/feature/sample
# Если вы хотите создать новую ветку git switch -c <new-branch-name> 
# Или отменить эту операцию с помощью: git switch -
# сейчас зная файл можно глянуть cat Sample/sample.md
# переключимся обратно
git checkout feature/sample
# в данном случае уже не надо указывать ветку для git merge
git merge
# прикольно - git сам разобрался: он коммиты по порядку применил (добавил)
cat Sample/sample.md
git commit -a -m "Conflict resolved"
# теперь конфликт на втором компе так же:
git push
git fetch
git status
git merge
# всё Ок
# git pull - это (fetch + merge) за один шаг
# теперь вопрос преподавтелю: на кой нужна была Первая ветка (git checkout -b feature/jdcp6) ?!
git merge --no-ff feature/sample
git push --all
git branch --all
git push --delete origin feature/sample
git branch --all
git branch -d feature/sample
git branch --all
git merge --no-ff feature/jdcp6
# конфликт
git commit -a -m "Conflict resolved"
git status
git push 
git push --delete origin feature/jdcp6
git branch -d feature/jdcp6
git branch --all
	
```
#
	15.2		Issues

```java
git add JDCP-6/15.2.md
git status
git commit -a -m "fixes #1 страница 15.2 исправлена"
git push 
# с моим английским проще произнести "Исусе", добавляя "Господи" в начале
git commit -a -m "fixes #2 изменения и ссылка добавлены"
git push
```
#
	15.3		Pull Requests

```java
git add JDCP-6/15.3.md
git status
git commit -a -m "fixes #3 added page 15.3 Pull Request"
git push 
# Shared Repository, Fork and Pull
# settings, collaborators 
# Reviewers
# Assignees
# Labels
```
+ **Resolve conflicts**
+ Необходимо будет разрешить конфликт
+ Сделать это можно как с помощью интерфейса **GitHub**,  так и локально
+ После разрешения конфликта станет доступной возможность Merge **Pull Request'а**
+ **Review requested**
+ *Approve*
+ После чего в истории **Pull Request'а** появится информация о **Review**
+ После операции **Merge** создастся **Merge Commit** и **Pull Request** будет закрыт
+ Вам необходимо будет выполнить синхронизацию веток.
+ **Fork**
+ Если у вас нет прав на запись в репозиторий, но хотите предложить в него улучшения, то воспользуйтесь кнопкой **Fork**
+ После внесения всех необходимых улучшений вы можете создать **Pull Request** в исходный репозиторий
+ **base, head**
+ запрос на **Pull Request** появится во вкладке **Pull Requests** проекта
+ Если **Resolve conflicts**, так же **GitHub** уведомит об отсутствии доступа на запись для **Merge**.
+ При этом разрешение конфликта (при отсутствии прав на запись в исходный репозиторий) будет записано в **fork**
+ При этом разработчик, с правами на запись в исходный репозиторий может сделать **Merge** с разрешением конфликта
+ После того, как конфликт будет разрешён какой-либо из сторон, появится возможность сделать **Merge** (у разработчика, обладающего правами назапись)
#
+	♿ 	Как изменить адрес origin репозитория в git?

```java
# Изменить origin адрес репозитория двумя способами:
# 1. Первый способ задать url репозитория:
# использовать команду git remote set-url origin, например:
# git remote set-url origin git@github.com:vicman-wi/wi-backend.git
git remote set-url origin https://github.com/UniMWS/Lesson-copy.git
# 2. Второй способ:
# Отредактировать файл .git/config: секция [remote "origin"] параметр - url. 
# Эти два способа идентичные. Т.е. вызов команды git remote set-url origin заменит содержимое git конфига.
```
+	ℹ️ источник: [https://jeka.by/ask/137](https://jeka.by/ask/137)
#
	15.4		Github pages

```java
git init
git remote add origin https://github.com/UniMWS/Pages.git
git remote
git remote -v
git add *
git commit -m "Initial version"
git checkout -b gh-pages
git push --all
```
+ Github pages - сервис, позволяющий публиковать веб-сайты, используямощности GitHub
+ Необходимо создать репозиторий на GitHub и склонировать его на локальную машину
+ GitHub использует бранч со специальным именем `gh-pages` в качестве хранилища файлов будущего веб-сайта
+ GitHub Pages создаст веб-сайт по адресу: `https://<ваш логин>.github.io/<название репозитория>/` В интерфейсе можно увидеть на вкладке **"Environment"** репозитория
+ На странице будет указана ссылка на сам веб-сайт и историяр азвёртываний

#
### Итог
+ Разобрали достаточно много вопросов:
1. Работа с удалёнными ветками;
2. Работа с Issues на GitHub;
3. Pull Request'ы (модели Shared Repository, Fork & Pull);
4. GitHub Pages.

---
[*мои конспекты*](./README.md)
