#!/bin/sh

git config user.email "travis@travis-ci.org"
git config user.name "Travis CI"

git checkout -b bin
git add repository
git commit -m "Travis build: $TRAVIS_BUILD_NUMBER"

git remote add origin-bin https://${GITHUB_TOKEN}@github.com/mikecat/LibraryTest.git > /dev/null 2>&1
git push --quiet --set-upstream origin-bin bin
