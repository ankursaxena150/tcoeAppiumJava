Sleep(2000)
$IeUpload = "Choose File to Upload"
$ChromeUpload = "Open"
$FirefoxUpload = "File Upload"

If WinExists($IeUpload) Then
	$UploadWinow = $IeUpload
ElseIf WinExists($ChromeUpload) Then
	$UploadWinow = $ChromeUpload
ElseIf WinExists($FirefoxUpload) Then
	$UploadWinow = $FirefoxUpload
Else
	$UploadWinow = ""
EndIf

If $UploadWinow <> "" Then
	ControlFocus($UploadWinow, "", "Edit1")
	ControlSetText($UploadWinow, "", "Edit1", $CmdLine[1])
	Sleep(1000)
	ControlClick($UploadWinow, "", "Button1")
EndIf