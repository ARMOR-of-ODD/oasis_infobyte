{"payload":{"allShortcutsEnabled":true,"fileTree":{"Task_Assessment_1":{"items":[{"name":"Cancellation_Detail.java","path":"Task_Assessment_1/Cancellation_Detail.java","contentType":"file"},{"name":"Connection_File.java","path":"Task_Assessment_1/Connection_File.java","contentType":"file"},{"name":"Enquiry_Detail.java","path":"Task_Assessment_1/Enquiry_Detail.java","contentType":"file"},{"name":"Initial_Program.java","path":"Task_Assessment_1/Initial_Program.java","contentType":"file"},{"name":"Main_Content.java","path":"Task_Assessment_1/Main_Content.java","contentType":"file"},{"name":"Passenger_Section.java","path":"Task_Assessment_1/Passenger_Section.java","contentType":"file"},{"name":"Reservation_Detail.java","path":"Task_Assessment_1/Reservation_Detail.java","contentType":"file"},{"name":"User_Login_Page.java","path":"Task_Assessment_1/User_Login_Page.java","contentType":"file"},{"name":"Welcome_Banner.java","path":"Task_Assessment_1/Welcome_Banner.java","contentType":"file"}],"totalCount":9},"":{"items":[{"name":"Task_Assessment_1","path":"Task_Assessment_1","contentType":"directory"},{"name":"Task_Assessment_2","path":"Task_Assessment_2","contentType":"directory"},{"name":"Task_Assessment_3","path":"Task_Assessment_3","contentType":"directory"},{"name":"Task_Assessment_4","path":"Task_Assessment_4","contentType":"directory"},{"name":"README.md","path":"README.md","contentType":"file"}],"totalCount":5}},"fileTreeProcessingTime":4.228362000000001,"foldersToFetch":[],"reducedMotionEnabled":"system","repo":{"id":634565589,"defaultBranch":"main","name":"OIBSIP-JAVA","ownerLogin":"nazar-ansari","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2023-04-30T20:20:47.000+05:30","ownerAvatar":"https://avatars.githubusercontent.com/u/77230322?v=4","public":true,"private":false,"isOrgOwned":false},"refInfo":{"name":"main","listCacheKey":"v0:1682866248.0","canEdit":true,"refType":"branch","currentOid":"110257b2cc15fc850d5467438e3f76fe4c263fb1"},"path":"Task_Assessment_1/User_Login_Page.java","currentUser":{"id":119148970,"login":"ARMOR-of-ODD","userEmail":"sreedharkumar551@gmail.com"},"blob":{"rawLines":["package Task_Assessment_1;","","// Importing Required Libraries for Program","import java.awt.*;","import java.awt.event.*;","import java.swing.*;","","import javax.swing.JButton;","import javax.swing.JFrame;","import javax.swing.JLabel;","import javax.swing.JOptionPane;","import javax.swing.JPasswordField;","import javax.swing.JTextField;","","public class User_Login_Page implements ActionListener {","    JFrame Front_Side;","    JLabel First_Lable, Second_Lable;","    JTextField User_Name;","    JPasswordField User_Pass;","    JButton First_Button, Second_Button;","    Main_Content Main_Content_Program;","","    User_Login_Page() {","        Front_Side = new JFrame(\"Login Portal\");","        Front_Side.getContentPane().setLayout(null);","        Front_Side.getContentPane().setBackground(Color.WHITE);","        First_Lable = new JLabel(\"Enter Your User Name\");","        First_Lable.setForeground(Color.RED);","        First_Lable.setBounds(50, 50, 100, 30);","        Second_Lable = new JLabel(\"Enter Your PassWord\");","        Second_Lable.setForeground(Color.RED);","        Second_Lable.setBounds(50, 80, 100, 30);","        User_Name = new JTextField(10);","        User_Name.setForeground(Color.YELLOW);","        User_Name.setBounds(150, 50, 100, 30);","        User_Name.addActionListener(this);","        User_Pass = new JPasswordField(10);","        User_Pass.setEchoChar(\"-\");","        User_Pass.addActionListener(this);","        User_Pass.setBounds(50, 120, 100, 30);","        First_Button = new JButton(\"Proceed\");","        First_Button.setForeground(Color.GRAY);","        First_Button.addActionListener(this);","        First_Button.setBounds(50, 120, 100, 30);","        Second_Button = new JButton(\"Abort\");","        Second_Button.setForeground(Color.GRAY);","        Second_Button.addActionListener(this);","        Second_Button.setBounds(180, 120, 100, 30);","","        First_Button.setMnemonic('P');","        Second_Button.setMnemonic('C');","","        Front_Side.getContentPane().add(First_Lable);","        Front_Side.getContentPane().add(Second_Lable);","        Front_Side.getContentPane().add(Second_Button);","        Front_Side.getContentPane().add(User_Name);","        Front_Side.getContentPane().add(User_Pass);","        Front_Side.getContentPane().add(First_Button);","        Front_Side.setBounds(300, 300, 300, 200);","        Front_Side.setResizable(false);","        Front_Side.setVisible(true);","    }","","    public void Action_ToPerformed(ActionEvent event) {","        if (event.getSource() == First_Button) {","            if (User_Name.getText().length() == 0 || User_Pass.getText().length() == 0) {","                JOptionPane.showMessageDialog(null, \"Some Input Fields are Missing !!\");","            } else if (User_Name.getText().equals(\"Railway_Admin\") && User_Pass.getText().equals(\"Rail_Admin_12345\")) {","                Front_Side.setVisible(false);","                Main_Content_Program = new Main_Content();","            } else {","                JOptionPane.showMessageDialog(null, \"Wrong User Name OR Password Which has Entered\");","            }","        } else {","            Front_Side.setVisible(false);","            System.exit(0);","        }","    }","}"],"stylingDirectives":[[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":25,"cssClass":"pl-s1"}],[],[{"start":0,"end":43,"cssClass":"pl-c"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":15,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":15,"cssClass":"pl-s1"},{"start":16,"end":21,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":17,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":25,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":25,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":30,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":33,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":19,"end":29,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":28,"cssClass":"pl-smi"},{"start":29,"end":39,"cssClass":"pl-k"},{"start":40,"end":54,"cssClass":"pl-smi"}],[{"start":4,"end":10,"cssClass":"pl-smi"},{"start":11,"end":21,"cssClass":"pl-s1"}],[{"start":4,"end":10,"cssClass":"pl-smi"},{"start":11,"end":22,"cssClass":"pl-s1"},{"start":24,"end":36,"cssClass":"pl-s1"}],[{"start":4,"end":14,"cssClass":"pl-smi"},{"start":15,"end":24,"cssClass":"pl-s1"}],[{"start":4,"end":18,"cssClass":"pl-smi"},{"start":19,"end":28,"cssClass":"pl-s1"}],[{"start":4,"end":11,"cssClass":"pl-smi"},{"start":12,"end":24,"cssClass":"pl-s1"},{"start":26,"end":39,"cssClass":"pl-s1"}],[{"start":4,"end":16,"cssClass":"pl-smi"},{"start":17,"end":37,"cssClass":"pl-s1"}],[],[{"start":4,"end":19,"cssClass":"pl-smi"}],[{"start":8,"end":18,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-k"},{"start":25,"end":31,"cssClass":"pl-smi"},{"start":32,"end":46,"cssClass":"pl-s"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":45,"cssClass":"pl-en"},{"start":46,"end":50,"cssClass":"pl-c1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":49,"cssClass":"pl-en"},{"start":50,"end":55,"cssClass":"pl-smi"},{"start":56,"end":61,"cssClass":"pl-c1"}],[{"start":8,"end":19,"cssClass":"pl-s1"},{"start":22,"end":25,"cssClass":"pl-k"},{"start":26,"end":32,"cssClass":"pl-smi"},{"start":33,"end":55,"cssClass":"pl-s"}],[{"start":8,"end":19,"cssClass":"pl-smi"},{"start":20,"end":33,"cssClass":"pl-en"},{"start":34,"end":39,"cssClass":"pl-smi"},{"start":40,"end":43,"cssClass":"pl-c1"}],[{"start":8,"end":19,"cssClass":"pl-smi"},{"start":20,"end":29,"cssClass":"pl-en"},{"start":30,"end":32,"cssClass":"pl-c1"},{"start":34,"end":36,"cssClass":"pl-c1"},{"start":38,"end":41,"cssClass":"pl-c1"},{"start":43,"end":45,"cssClass":"pl-c1"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":33,"cssClass":"pl-smi"},{"start":34,"end":55,"cssClass":"pl-s"}],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":34,"cssClass":"pl-en"},{"start":35,"end":40,"cssClass":"pl-smi"},{"start":41,"end":44,"cssClass":"pl-c1"}],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":30,"cssClass":"pl-en"},{"start":31,"end":33,"cssClass":"pl-c1"},{"start":35,"end":37,"cssClass":"pl-c1"},{"start":39,"end":42,"cssClass":"pl-c1"},{"start":44,"end":46,"cssClass":"pl-c1"}],[{"start":8,"end":17,"cssClass":"pl-s1"},{"start":20,"end":23,"cssClass":"pl-k"},{"start":24,"end":34,"cssClass":"pl-smi"},{"start":35,"end":37,"cssClass":"pl-c1"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":31,"cssClass":"pl-en"},{"start":32,"end":37,"cssClass":"pl-smi"},{"start":38,"end":44,"cssClass":"pl-c1"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":27,"cssClass":"pl-en"},{"start":28,"end":31,"cssClass":"pl-c1"},{"start":33,"end":35,"cssClass":"pl-c1"},{"start":37,"end":40,"cssClass":"pl-c1"},{"start":42,"end":44,"cssClass":"pl-c1"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":35,"cssClass":"pl-en"},{"start":36,"end":40,"cssClass":"pl-smi"}],[{"start":8,"end":17,"cssClass":"pl-s1"},{"start":20,"end":23,"cssClass":"pl-k"},{"start":24,"end":38,"cssClass":"pl-smi"},{"start":39,"end":41,"cssClass":"pl-c1"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":29,"cssClass":"pl-en"},{"start":30,"end":33,"cssClass":"pl-s"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":35,"cssClass":"pl-en"},{"start":36,"end":40,"cssClass":"pl-smi"}],[{"start":8,"end":17,"cssClass":"pl-smi"},{"start":18,"end":27,"cssClass":"pl-en"},{"start":28,"end":30,"cssClass":"pl-c1"},{"start":32,"end":35,"cssClass":"pl-c1"},{"start":37,"end":40,"cssClass":"pl-c1"},{"start":42,"end":44,"cssClass":"pl-c1"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":34,"cssClass":"pl-smi"},{"start":35,"end":44,"cssClass":"pl-s"}],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":34,"cssClass":"pl-en"},{"start":35,"end":40,"cssClass":"pl-smi"},{"start":41,"end":45,"cssClass":"pl-c1"}],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":38,"cssClass":"pl-en"},{"start":39,"end":43,"cssClass":"pl-smi"}],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":30,"cssClass":"pl-en"},{"start":31,"end":33,"cssClass":"pl-c1"},{"start":35,"end":38,"cssClass":"pl-c1"},{"start":40,"end":43,"cssClass":"pl-c1"},{"start":45,"end":47,"cssClass":"pl-c1"}],[{"start":8,"end":21,"cssClass":"pl-s1"},{"start":24,"end":27,"cssClass":"pl-k"},{"start":28,"end":35,"cssClass":"pl-smi"},{"start":36,"end":43,"cssClass":"pl-s"}],[{"start":8,"end":21,"cssClass":"pl-smi"},{"start":22,"end":35,"cssClass":"pl-en"},{"start":36,"end":41,"cssClass":"pl-smi"},{"start":42,"end":46,"cssClass":"pl-c1"}],[{"start":8,"end":21,"cssClass":"pl-smi"},{"start":22,"end":39,"cssClass":"pl-en"},{"start":40,"end":44,"cssClass":"pl-smi"}],[{"start":8,"end":21,"cssClass":"pl-smi"},{"start":22,"end":31,"cssClass":"pl-en"},{"start":32,"end":35,"cssClass":"pl-c1"},{"start":37,"end":40,"cssClass":"pl-c1"},{"start":42,"end":45,"cssClass":"pl-c1"},{"start":47,"end":49,"cssClass":"pl-c1"}],[],[{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":32,"cssClass":"pl-en"},{"start":33,"end":36,"cssClass":"pl-s"}],[{"start":8,"end":21,"cssClass":"pl-smi"},{"start":22,"end":33,"cssClass":"pl-en"},{"start":34,"end":37,"cssClass":"pl-s"}],[],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":51,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":52,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":53,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":49,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":49,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"},{"start":36,"end":39,"cssClass":"pl-en"},{"start":40,"end":52,"cssClass":"pl-s1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":28,"cssClass":"pl-en"},{"start":29,"end":32,"cssClass":"pl-c1"},{"start":34,"end":37,"cssClass":"pl-c1"},{"start":39,"end":42,"cssClass":"pl-c1"},{"start":44,"end":47,"cssClass":"pl-c1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":31,"cssClass":"pl-en"},{"start":32,"end":37,"cssClass":"pl-c1"}],[{"start":8,"end":18,"cssClass":"pl-smi"},{"start":19,"end":29,"cssClass":"pl-en"},{"start":30,"end":34,"cssClass":"pl-c1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":34,"cssClass":"pl-en"},{"start":35,"end":46,"cssClass":"pl-smi"},{"start":47,"end":52,"cssClass":"pl-s1"}],[{"start":8,"end":10,"cssClass":"pl-k"},{"start":12,"end":17,"cssClass":"pl-s1"},{"start":18,"end":27,"cssClass":"pl-en"},{"start":33,"end":45,"cssClass":"pl-s1"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":16,"end":25,"cssClass":"pl-smi"},{"start":26,"end":33,"cssClass":"pl-en"},{"start":36,"end":42,"cssClass":"pl-en"},{"start":48,"end":49,"cssClass":"pl-c1"},{"start":53,"end":62,"cssClass":"pl-smi"},{"start":63,"end":70,"cssClass":"pl-en"},{"start":73,"end":79,"cssClass":"pl-en"},{"start":85,"end":86,"cssClass":"pl-c1"}],[{"start":16,"end":27,"cssClass":"pl-smi"},{"start":28,"end":45,"cssClass":"pl-en"},{"start":46,"end":50,"cssClass":"pl-c1"},{"start":52,"end":86,"cssClass":"pl-s"}],[{"start":14,"end":18,"cssClass":"pl-k"},{"start":19,"end":21,"cssClass":"pl-k"},{"start":23,"end":32,"cssClass":"pl-smi"},{"start":33,"end":40,"cssClass":"pl-en"},{"start":43,"end":49,"cssClass":"pl-en"},{"start":50,"end":65,"cssClass":"pl-s"},{"start":70,"end":79,"cssClass":"pl-smi"},{"start":80,"end":87,"cssClass":"pl-en"},{"start":90,"end":96,"cssClass":"pl-en"},{"start":97,"end":115,"cssClass":"pl-s"}],[{"start":16,"end":26,"cssClass":"pl-smi"},{"start":27,"end":37,"cssClass":"pl-en"},{"start":38,"end":43,"cssClass":"pl-c1"}],[{"start":16,"end":36,"cssClass":"pl-s1"},{"start":39,"end":42,"cssClass":"pl-k"},{"start":43,"end":55,"cssClass":"pl-smi"}],[{"start":14,"end":18,"cssClass":"pl-k"}],[{"start":16,"end":27,"cssClass":"pl-smi"},{"start":28,"end":45,"cssClass":"pl-en"},{"start":46,"end":50,"cssClass":"pl-c1"},{"start":52,"end":99,"cssClass":"pl-s"}],[],[{"start":10,"end":14,"cssClass":"pl-k"}],[{"start":12,"end":22,"cssClass":"pl-smi"},{"start":23,"end":33,"cssClass":"pl-en"},{"start":34,"end":39,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":23,"cssClass":"pl-en"},{"start":24,"end":25,"cssClass":"pl-c1"}],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/nazar-ansari/OIBSIP-JAVA/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false,"repoAlertsPath":"/nazar-ansari/OIBSIP-JAVA/security/dependabot","repoSecurityAndAnalysisPath":"/nazar-ansari/OIBSIP-JAVA/settings/security_analysis","repoOwnerIsOrg":false,"currentUserCanAdminRepo":false},"displayName":"User_Login_Page.java","displayUrl":"https://github.com/nazar-ansari/OIBSIP-JAVA/blob/main/Task_Assessment_1/User_Login_Page.java?raw=true","headerInfo":{"blobSize":"3.02 KB","deleteInfo":{"deletePath":"https://github.com/nazar-ansari/OIBSIP-JAVA/delete/main/Task_Assessment_1/User_Login_Page.java","deleteTooltip":"Fork this repository and delete the file"},"editInfo":{"editTooltip":"Fork this repository and edit the file"},"ghDesktopPath":"https://desktop.github.com","gitLfsPath":null,"onBranch":true,"shortPath":"1a8d0a1","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fnazar-ansari%2FOIBSIP-JAVA%2Fblob%2Fmain%2FTask_Assessment_1%2FUser_Login_Page.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"79","truncatedSloc":"72"},"mode":"file"},"image":false,"isCodeownersFile":null,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","large":false,"loggedIn":true,"newDiscussionPath":"/nazar-ansari/OIBSIP-JAVA/discussions/new","newIssuePath":"/nazar-ansari/OIBSIP-JAVA/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/nazar-ansari/OIBSIP-JAVA/blob/main/Task_Assessment_1/User_Login_Page.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/nazar-ansari/OIBSIP-JAVA/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"nazar-ansari","repoName":"OIBSIP-JAVA","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":false,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"User_Login_Page","kind":"class","identStart":332,"identEnd":347,"extentStart":319,"extentEnd":3091,"fullyQualifiedName":"User_Login_Page","identUtf16":{"start":{"lineNumber":14,"utf16Col":13},"end":{"lineNumber":14,"utf16Col":28}},"extentUtf16":{"start":{"lineNumber":14,"utf16Col":0},"end":{"lineNumber":78,"utf16Col":1}}},{"name":"Front_Side","kind":"field","identStart":387,"identEnd":397,"extentStart":380,"extentEnd":398,"fullyQualifiedName":"User_Login_Page::Front_Side","identUtf16":{"start":{"lineNumber":15,"utf16Col":11},"end":{"lineNumber":15,"utf16Col":21}},"extentUtf16":{"start":{"lineNumber":15,"utf16Col":4},"end":{"lineNumber":15,"utf16Col":22}}},{"name":"First_Lable","kind":"field","identStart":410,"identEnd":421,"extentStart":403,"extentEnd":436,"fullyQualifiedName":"User_Login_Page::First_Lable","identUtf16":{"start":{"lineNumber":16,"utf16Col":11},"end":{"lineNumber":16,"utf16Col":22}},"extentUtf16":{"start":{"lineNumber":16,"utf16Col":4},"end":{"lineNumber":16,"utf16Col":37}}},{"name":"Second_Lable","kind":"field","identStart":423,"identEnd":435,"extentStart":403,"extentEnd":436,"fullyQualifiedName":"User_Login_Page::Second_Lable","identUtf16":{"start":{"lineNumber":16,"utf16Col":24},"end":{"lineNumber":16,"utf16Col":36}},"extentUtf16":{"start":{"lineNumber":16,"utf16Col":4},"end":{"lineNumber":16,"utf16Col":37}}},{"name":"User_Name","kind":"field","identStart":452,"identEnd":461,"extentStart":441,"extentEnd":462,"fullyQualifiedName":"User_Login_Page::User_Name","identUtf16":{"start":{"lineNumber":17,"utf16Col":15},"end":{"lineNumber":17,"utf16Col":24}},"extentUtf16":{"start":{"lineNumber":17,"utf16Col":4},"end":{"lineNumber":17,"utf16Col":25}}},{"name":"User_Pass","kind":"field","identStart":482,"identEnd":491,"extentStart":467,"extentEnd":492,"fullyQualifiedName":"User_Login_Page::User_Pass","identUtf16":{"start":{"lineNumber":18,"utf16Col":19},"end":{"lineNumber":18,"utf16Col":28}},"extentUtf16":{"start":{"lineNumber":18,"utf16Col":4},"end":{"lineNumber":18,"utf16Col":29}}},{"name":"First_Button","kind":"field","identStart":505,"identEnd":517,"extentStart":497,"extentEnd":533,"fullyQualifiedName":"User_Login_Page::First_Button","identUtf16":{"start":{"lineNumber":19,"utf16Col":12},"end":{"lineNumber":19,"utf16Col":24}},"extentUtf16":{"start":{"lineNumber":19,"utf16Col":4},"end":{"lineNumber":19,"utf16Col":40}}},{"name":"Second_Button","kind":"field","identStart":519,"identEnd":532,"extentStart":497,"extentEnd":533,"fullyQualifiedName":"User_Login_Page::Second_Button","identUtf16":{"start":{"lineNumber":19,"utf16Col":26},"end":{"lineNumber":19,"utf16Col":39}},"extentUtf16":{"start":{"lineNumber":19,"utf16Col":4},"end":{"lineNumber":19,"utf16Col":40}}},{"name":"Main_Content_Program","kind":"field","identStart":551,"identEnd":571,"extentStart":538,"extentEnd":572,"fullyQualifiedName":"User_Login_Page::Main_Content_Program","identUtf16":{"start":{"lineNumber":20,"utf16Col":17},"end":{"lineNumber":20,"utf16Col":37}},"extentUtf16":{"start":{"lineNumber":20,"utf16Col":4},"end":{"lineNumber":20,"utf16Col":38}}},{"name":"User_Login_Page","kind":"method","identStart":578,"identEnd":593,"extentStart":578,"extentEnd":2339,"fullyQualifiedName":"User_Login_Page::User_Login_Page","identUtf16":{"start":{"lineNumber":22,"utf16Col":4},"end":{"lineNumber":22,"utf16Col":19}},"extentUtf16":{"start":{"lineNumber":22,"utf16Col":4},"end":{"lineNumber":61,"utf16Col":5}}},{"name":"Action_ToPerformed","kind":"method","identStart":2357,"identEnd":2375,"extentStart":2345,"extentEnd":3089,"fullyQualifiedName":"User_Login_Page::Action_ToPerformed","identUtf16":{"start":{"lineNumber":63,"utf16Col":16},"end":{"lineNumber":63,"utf16Col":34}},"extentUtf16":{"start":{"lineNumber":63,"utf16Col":4},"end":{"lineNumber":77,"utf16Col":5}}}]}},"copilotAccessInfo":{"accessAllowed":false,"hasSubscriptionEnded":false,"orgHasCFBAccess":false,"userHasCFIAccess":false,"userIsOrgAdmin":false,"userIsOrgMember":false,"business":null},"csrf_tokens":{"/nazar-ansari/OIBSIP-JAVA/branches":{"post":"m9wfPOaFR8BzB-i0pEq_QhOayLGaoubhHvqywnVMrkbseKt-sNPLNBFainuqLfRx7y_HKlrJR92FHC4x2gis1A"}}},"title":"OIBSIP-JAVA/Task_Assessment_1/User_Login_Page.java at main · nazar-ansari/OIBSIP-JAVA","locale":"en"}