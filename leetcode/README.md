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
git restore b.txt //可以将暂存区的文件内容，还原至工作区，即上一次git add 执行的改动；//抛弃工作区改动，用暂存区文件还原至工作区
假设b.txt修改完成，需要stage至暂存区：
git add b.txt  