06.02.2023
---
## lesson14

### История работы и ветки

	14.1		Ветки
```java
		# branch
		# current branch
		# в папке demo
		git init
		# базовый комит в main, потом создавать новую ветку
		git branch
		git add index.html
		git commit -m "Initial commit"
		# создаем новую ветку
		git branch feature/payment
		git branch
		git checkout feature/payment
		git status
		git add *.html
		git commit -m "Payment Page"
		git checkout main
		git log
		git checkout feature/payment
		git log
		git checkout main
		# создаем на github новый чистый проект web-project
		git remote add origin <url web-project>
		# по дефолту пушится main? почему всё таки origin?
		git push -u origin main
		git push -u origin feature/payment
		git checkout feature/payment
		# добавляем кнопку Pay в payment.html
		git commit -a -m "Pay button"
```
#
	14.2		Слияние изменений. Merge
```java
		#merge
		git checkout main
		#забрать изменения  из feature/payment в main
		git merge --no-ff feature/payment
		#за счет флага --no-ff автоматически создаётся комит в main и фиксит изменения
		git status
		git log
		git push
		git log --oneline --graph
		#если HEAD -> только main, то для полной синхронизации обеих веток еще раз push
		git push
		# теперь (HEAD -> main, origin/main), то есть и локальный main, и origin/main синхронизированы
		# можно визуализировать конкретную ветку
		git log --oneline --graph feature/payment
```
#
	14.3		конфликты
```java
		git checkout main
		git branch feature/metrika
		git branch feature/analytics
		git checkout feature/metrika
		#добавим скрипт "Yandex Metrika" в index.html
		git commit -a -m "Yandex Metrika"
		git checkout feature/analytics
		#здесь в index.html нет следов метрики, т.к. ветка feature/analytics о них не знает!
		#добавим скрипт "Google Analytics" в index.html
		git commit -a -m "Google Analytics"
		git log --graph --oneline --all
		#теперь изменения обеих веток можно слить в main одной командой, но будем последовательно
		git checkout main
		git merge --no-ff feature/metrika
		git merge --no-ff feature/analytics -m "Merge feature/analytics"
		#xep - Automatic merge failed
		#скрипт в разных ветках нарисован в одной и той же строке - какую должен выбрать автомат?
		#в редакторе кода то можно с помощью отдельных ссылок применять разные изменения
		#короче, вручную скорректировали страницу, а даже при Попытке переключения на другую ветку
		git checkout feature/analytics
		#не переключит и всё равно пишет ошибку:
		#(main|MERGING) 
		#error: you need to resolve your current index first
		#index.html: needs merge
		git status
		#покажет где какие конфликты
		# надо add нужный изменённый файл
		git commit -a -m "Analytics merged"
		git status
		git log --oneline --graph
		#показано как бы последовательное сливание сначала feature/metrika, потом feature/analytics
		#теперь надо на github
		# ! по умолчанию вновь созданные локально ветки не привязываются к удалённым
		#   это надо делать отдельной командой
		# пока делаем просто push и смотрим
		git push
		#надо отдельно указать привязку локальных веток к удалённым
		git push -u origin feature/metrika
		git push -u origin feature/analytics
		git push
		git log --oneline --graph
```
#
	14.4		Удаление веток. Теги
```java
		# git branch -d <имя ветки>
		# ветка не должна быть текущей
		# удальть с github и локально
		git push --delete origin feature/payment
		git branch -d feature/payment
		# Теги - отметить определённый момент в истории удобным образом
		git tag -a v1.0 -m "Версия 1.0"
		git tag
		git show v1.0
		# удалить теги
		git tag -d v14.1
		git tag -d v14.2
		git tag -d v14.3
		git tag -d v14.4
		# если уже тправлено в github, то сначала
		git push --delete origin v1.1
		# потом
		git tag -d v1.1
		# теги можно указать позже, указав id-коммита
		git tag -a v14.1 -m "Ветки" a3a90e
		git tag -a v14.2 -m "Слияние изменений. Merge" 6d706
		git tag -a v14.3 -m "Конфликты" 193ea1
		git tag -a v14.4 -m "Удаление веток. Теги"  a67231
		# по умолчанию теги не отправляются - для отправки на github ключ указать явно
		git push --tags
		# это именно теги отправятся!
		git push
```
#
	14.5		Работа с историей
```java
		# попробуем указать конкретный путь
		git log -- index.html
		# уже лучше. теперь для каждого коммита
		git show a3a90 -- index.html
		# так явно лучше. теперь одной командой
		git log -p -- index.html
		# жопой чуял, что будет старый добрый grep !)
		git log --grep 'вет'
		# если же мы знаем конкретную строку поиска
		git log -S'nginx' -p
		git log -S'./GIT_HISTORY.md' -p
		# искать по всем веткам
		git log --all
		# Авторство изменений
		git blame -- index.html
```
		
#### Итог
```java
		# создаем файлик 14.5.md
		git add *.md
		git commit -a -m "add 14.5.md - Работа с историей"
		git tag -a v14.4 -m "Работа с историей"
```	
#
	14.6		Устройство веток и HEAD
```java
		# Ветка - это динамичсекий указатель на определённый коммит
		# HEAD - тоже указатель - содержит в себе ссылку на ветку
		# А если переключить HEAD на конкретный коммит?
		git log --oneline
		git checkout b00b58a
		#	You are in 'detached HEAD' state. You can look around, make experimental
		#	changes and commit them, and you can discard any commits you make in this
		#	state without impacting any branches by switching back to a branch.
		#	
		#	If you want to create a new branch to retain commits you create, you may
		#	do so (now or later) by using -c with the switch command. Example:
		#	git switch -c <new-branch-name>
		#	Or undo this operation with:
		#	git switch -
		#	Turn off this advice by setting config variable advice.detachedHead to false
		#
		# а можно вот так ветку создать и сразу переключиться git checkout -b <new-branch-name>
		git log --oneline
		# Detached HEAD - когда HEAD указывает не на ветку, можно делать коммиты, но не рекомендуется,
		# так как они будут сами по себе не привязанные ни к одной ветке
		#git command -a -m "Detached HEAD"
		#
		# обсудим --no-ff
		# это отключение механизма fast-forward
		git checkout -b feature/ff
		# вносим изменения в файлик 14.5.md
		git commit -a -m "FF"
		git checkout main
		git log --oneline --graph --all
		# без --no-ff
		git merge feature/ff
		# сравним
		git log --oneline --graph --all
		# Git просто переставил HEAD на последний коммит
		# а теперь так
		git checkout -b feature/noff
		# вносим изменения в файлик 14.5.md
		git commit -a -m "NOFF"
		git log --oneline --graph --all
		git checkout main
		# используем --no-ff
		git merge --no-ff feature/noff
		git log --oneline --graph --all
		# Git создал новый коммит, который объединяет все изменения
		# git reset позволяет передвигать указатель, тем самым эмулируя "отмену" коммитов
		# сами коммиты не отменяются, мы просто перемещаем указатель
		# ! На самом деле отменить коммиты нельзя, можно лишь сделать новые.
```
		
#### Итог
```java
		# создаем файлик 14.6.md
		git add *.md
		git commit -a -m "add 14.6.md - Устройство веток и HEAD"
		git tag -a v14.6 -m "Устройство веток и HEAD"
		git push --tags
		git push
```
#
	14.7		Откат изменений
```java
		# меняем файлик test-demo.md
		git commit -a -m "Reset Demo" 
		# git reset  [--hard, --soft, --mixed]
		# git reset <mode> <commit-id>, где по умолчанию --mixed 
		# специальный синтаксис:
		# git reset <mode> HEAD~<num> - отойти от HEAD на n-шагов
		#
		# каталог Reset
		# файл README.md, строка First
		git init
		git commit -m "First"
		# добавим строку Second
		git commit -a -m "Second"
		# добавим строку Third
		git add README.md
		# добавим строку Fourth
		git status
		# каталог-копия Reset-hard
		git reset --hard HEAD~1
		git status
		git log
		# Уничтожено всё, кроме 1 коммита
		# каталог-копия Reset-soft
		git reset --soft HEAD~1
		git status
		git log --oneline --graph
		# удален последний коммит, остальное (включая файл) без изменений
		# каталог-копия Reset-mixed
		git reset --mixed HEAD~1
		git status
		git log --oneline --graph
		# удален последний коммит и Stage
```
		
#### Итог
```java
		# создаем файлик 14.7.md
		git add *.md
		git commit -a -m "add 14.7.md - Откат изменений"
		git tag -a v14.7 -m "Откат изменений"
		git push --tags
		git push
```

---
[*мои конспекты*](./README.md)
