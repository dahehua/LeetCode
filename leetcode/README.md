## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).



git init


touch b.txt         //在workspace增加文件， 但未stage至staging area

git add b.txt       //将workspace的文件stage至staging area， staging area跟踪该文件改动

rm b.txt            //删除workspace的文件， 但未stage至staging area
git rm b.txt        //删除workspace的文件， 并且stage至staging area

假设b.txt已经stage至staging area， 现在workspace中更改了该文件, 因为staging area跟踪该文件变动：

1、
    b.txt已修改，但未git add b.txt; 此时可以git restore b.txt,撤销所有修改，撤销的内容是与 local repository 的内容做比较

2、
    b.txt已多次修改，并且多次git add b.txt; 但未git commit;
    此时可以git restore --staged b.txt, 这会将之前该文件所有的add的内容都从 staging area 删去， 
    然后git restore b.txt， 会将 workspace 中该文件所有的变动都撤销，撤销的比较标准是 与 local repository 内容做比较； 

简言之：
workspace的改动需要git add至staging area，可能会多次执行git add，但这不会影响到local repository，因为未执行git commit;
当执行git commit后， local repository 的HEAD会指向 staging area 生成的对象（目录树）；
此后，workspace有更改，多次git add至staging area后， 可以git restore --staged将staging area的所有改动撤回；即staging area的状态恢复成local repository的状态，但workspace仍然保留所有改动；
若需要将workspace也恢复成local repository状态，则git restore可以将某文件的所有改动都撤销，这会恢复workspace的内容，使目标文件内容与local repository一致；
注意：
1、workspace某文件修改后，未git add， 则只能git restore *.file ， 即该文件所有改动都撤销，恢复至local repository状态；
2、若workspace文件修改后且git add; 
    则先git restore --staged *.file，将改动从staging area撤回，
    然后git restore *.file， 使workspace文件恢复至local repository状态；



1、新建b.txt, 修改内容后， git add & commit; 将改动提交到repo;
2、修改b.txt，然后 git add; 然后再修改b.txt, 此时欲恢复， git restore b.txt； 这时候恢复的内容是上次git add所记录的内容，即将暂存区的内容恢复至工作区；
3、欲撤销提交到暂存区的改动，git restore --staged b.txt; 此时暂存区就恢复成repo里的内容，然后再次 git restore b.txt; 此时工作区的内容恢复至与 repo 一致；

git restore --staged  //将暂存区恢复成repo
git restore // 将工作区恢复成暂存区内容
上面两条依次执行， 将工作区恢复成repo


1.readme.txt自动修改后，还没有放到暂存区，使用 撤销修改就回到和版本库一模一样的状态。
2.另外一种是readme.txt已经放入暂存区了，接着又作了修改，撤销修改就回到添加暂存区后的状态。