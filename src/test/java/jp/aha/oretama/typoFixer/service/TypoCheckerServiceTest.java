    private TypoCheckerService service = new TypoCheckerService(new JLanguageTool(new AmericanEnglish()), null);
    private String oneLineRawDiff = "diff --git a/README.md b/README.md\n" +
    private String afterIsOneLineRawDiff = "diff --git a/README.md b/README.md\n" +
            "index 3398d7a..660bb3a 100644\n" +
            "--- a/README.md\n" +
            "+++ b/README.md\n" +
            "@@ -1,2 +1 @@\n" +
            "-# test\n" +
            "-aaa\n" +
            "+# test3\n" +
            "\\ No newline at end of file";

    private String multiLineRawDiff = "diff --git a/README.md b/README.md\n" +
            "index 8cacdfa..e41e46f 100644\n" +
            "--- a/README.md\n" +
            "+++ b/README.md\n" +
            "@@ -1,4 +1,5 @@\n" +
            " # test\n" +
            " \n" +
            "-This is test repository.\n" +
            "-Ignore this repostiosy.\n" +
            "+This is test for typo fixer.\n" +
            "+This is typooo.\n" +
            "+This is alsonn typo.";

    private String twoFileRawDiff = "diff --git a/typo-fixer.json b/typo-fixer.json\n" +
    public void getAddedFromOnlyOneLine() {
        List<Diff> result = service.getAdded(oneLineRawDiff);
        assertEquals(1, diff.getAddLines().size());
        Diff.AddLine addLine = diff.getAddLines().get(0);
        assertEquals("Nobody reads", addLine.getLineContent());
        assertEquals(1, addLine.getFileLine().intValue());
        assertEquals(2, addLine.getDiffLine().intValue());
    public void getAddedFromOnlyOneLineInAfterFile() {
        List<Diff> result = service.getAdded(afterIsOneLineRawDiff);
        assertEquals(1, result.size());
        Diff diff = result.get(0);
        assertEquals("README.md", diff.getPath());
        assertEquals(1, diff.getAddLines().size());
        Diff.AddLine addLine = diff.getAddLines().get(0);
        assertEquals("# test3", addLine.getLineContent());
        assertEquals(1, addLine.getFileLine().intValue());
        assertEquals(3, addLine.getDiffLine().intValue());
    }

    @Test
    public void getAddedFromMultiLine() {
        List<Diff> result = service.getAdded(multiLineRawDiff);

        assertEquals(1, result.size());
        Diff diff = result.get(0);
        assertEquals("README.md", diff.getPath());

        assertEquals(3, diff.getAddLines().size());
        Diff.AddLine addLine = diff.getAddLines().get(0);
        assertEquals("This is test for typo fixer.", addLine.getLineContent());
        assertEquals(3, addLine.getFileLine().intValue());
        assertEquals(5, addLine.getDiffLine().intValue());
    }

    @Test
    public void getAddedFromTwoFile() {
        List<Diff> result = service.getAdded(twoFileRawDiff);

        assertEquals(2, result.size());
        assertEquals(3, diff0.getAddLines().size());
        Diff.AddLine addLine0 = diff0.getAddLines().get(1);
        assertEquals("   \"extensions\": [\".md\"] ", addLine0.getLineContent());
        assertEquals(2, addLine0.getFileLine().intValue());
        assertEquals(2, addLine0.getDiffLine().intValue());
        assertEquals(5, diff1.getAddLines().size());
        Diff.AddLine addLine1 = diff1.getAddLines().get(2);
        assertEquals("This is test for typo fixer.", addLine1.getLineContent());
        assertEquals(3, addLine1.getFileLine().intValue());
        assertEquals(5, addLine1.getDiffLine().intValue());