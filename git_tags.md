# GIT TAGS

### an informal introduction, initally by sehqlr

There is an old axiom among writers: Writing is Rewriting.

The same goes for coders, too: Coding is Recoding.

This is good, because there are always improvements to be made.
Using version control, like git, is even better for keeping track of your work.
However, the question is: what version are you going to distribute?
How do you tell the world that you're finally at **Version 1.0**?

The answer to this is by using tags. git's command line help documentation 
for this feature is accessible via `git help tag`. If you want an example,
[sehqlr's word-agent repo](https://github.com/sehqlr/word-agent) uses them
sparingly.

Tags are a special commit that serve as a guidepost for someone looking through
the commit history. There are various types of tags, but the ones that we are
interested in are annotated tags. These tags have a text label and a commit
message.

For instance, 
    `git tag -a v1.0 -m "My app is complete. Waiting for the money to rain in."`
would add the tag named v1.0 to your repository, and anyone looking at the log
entry would see your self-satisfied message.

There are many other uses for tags, including GPG verification for your
NSA-busting social media app. I suggest that you look at the documentation
to get a better idea of the usage.

`git tag -a bye -m "Have fun with tags"`
