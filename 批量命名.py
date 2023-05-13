Sub BatchRename()
    Dim MyPath As String
    Dim MyFile As String
    Dim NewName As String
    Dim i As Integer
    
    '设置文件夹路径
    MyPath = "C:\Users\UserName\Documents\"
    
    '获取第一个文件名
    MyFile = Dir(MyPath & "*.docx")
    
    '循环重命名每个文件
    Do While MyFile <> ""
        '获取新的文件名
        NewName = "NewName" & i & ".docx"
        
        '重命名文件
        Name MyPath & MyFile As MyPath & NewName
        
        '获取下一个文件名
        MyFile = Dir()
        
        '增加计数器
        i = i + 1
    Loop
End Sub
