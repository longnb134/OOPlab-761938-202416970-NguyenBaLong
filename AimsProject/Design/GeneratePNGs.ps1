$pumlClass = Get-Content -Path "C:\Users\Admin\.vscode\OOPlab-761938-202416970-NguyenBaLong\AimsProject\Design\ClassDiagram.puml" -Raw
Invoke-WebRequest -Uri "https://kroki.io/plantuml/png" -Method Post -Body $pumlClass -ContentType "text/plain" -OutFile "C:\Users\Admin\.vscode\OOPlab-761938-202416970-NguyenBaLong\AimsProject\Design\ClassDiagram.png"

$pumlUseCase = Get-Content -Path "C:\Users\Admin\.vscode\OOPlab-761938-202416970-NguyenBaLong\AimsProject\Design\UseCaseDiagram.puml" -Raw
Invoke-WebRequest -Uri "https://kroki.io/plantuml/png" -Method Post -Body $pumlUseCase -ContentType "text/plain" -OutFile "C:\Users\Admin\.vscode\OOPlab-761938-202416970-NguyenBaLong\AimsProject\Design\UseCaseDiagram.png"
