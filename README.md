# How to publish a new Quarkus extension in Maven Central Repository

1. I have read [this document](https://maven.apache.org/repository/guide-central-repository-upload.html), especially the section "Publishing your artifacts to the Central Repository" which shows how to publish open source projects to [Open Source Software Repository Hosting (OSSRH)](https://central.sonatype.org/pages/ossrh-guide.html);

    > **Note:** When I went to create a new project in Jira for my repositories, it required an exchange of messages via ticket and a few hours of waiting for the process to be completed.

2. I followed all the steps in [this document](https://central.sonatype.org/publish/publish-guide/);
3. I added the necessary tags shown in [this document](https://central.sonatype.org/publish/requirements/);
4. By following the steps to deploy via Maven in [this document](https://central.sonatype.org/publish/publish-maven/), I generated a GPG key according to [this document](https://central.sonatype.org/publish/requirements/gpg/).

> **Note:** [This video](https://www.youtube.com/watch?v=bxP9IuJbcDQ) helped me a lot.
