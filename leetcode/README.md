## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).



git init


touch b.txt         //在工作区增加文件， 但未stage至暂存区域

git add b.txt       //将工作区的文件stage至暂存区， 暂存区跟踪该文件改动

rm b.txt            //删除工作区的文件， 但未stage至暂存区域
git rm b.txt        //删除工作区的文件， 并且stage至暂存区域

假设b.txt已经stage至暂存区， 现在在工作区更改了该文件, 因为暂存区跟踪该文件变动：

1、
    b.txt已修改，但未git add b.txt; 此时可以git restore b.txt,撤销所有修改，撤销的内容是与 版本库的内容做比较

2、
    b.txt已多次修改，并且多次git add b.txt; 但未git commit;
    此时可以git restore --staged b.txt, 这会将之前该文件所有的add的内容都从 暂存区 删去， 
    然后git restore b.txt， 会将工作区该文件所有的变动都撤销，撤销的比较标准是 与 版本库 内容做比较； 

简言之：
工作区的改动需要git add至暂存区，可能会多次执行git add,但这不会影响到版本库，因为未执行gti commit;
当执行git commit后， 版本库的HEAD会指向暂存区生成的对象（目录树）；
此后，工作区有更改，多次git add至暂存区后， 可以git restore --staged将暂存区的所有改动撤回；即暂存区的状态恢复成版本库的状态，但工作区仍然是最新的改动；
若需要将工作区也恢复成版本库状态，则git restore 可以将某文件的所有改动都撤销，这会更改工作区文件的内容，使文件内容与版本库一致；
注意：
1、工作区某文件修改后，未git add， 则只能git restore *.file ,即该文件所有改动都撤销，恢复至版本库状态；
2、若工作区文件修改后且git add; 
    则先git restore --staged *.file，将改动从暂存区撤回，
    然后git restore *.file， 使工作区文件恢复至版本库状态；