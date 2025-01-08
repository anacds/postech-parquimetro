[1mdiff --git a/.gitignore b/.gitignore[m
[1mindex 2f43530..07c9986 100644[m
[1m--- a/.gitignore[m
[1m+++ b/.gitignore[m
[36m@@ -15,3 +15,4 @@[m [mbuildNumber.properties[m
 .project[m
 # JDT-specific (Eclipse Java Development Tools)[m
 .classpath[m
[32m+[m[32m/.metadata/[m
[1mdiff --git a/parquimetro/bin/.gitattributes b/parquimetro/bin/.gitattributes[m
[1mnew file mode 100644[m
[1mindex 0000000..3b41682[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/.gitattributes[m
[36m@@ -0,0 +1,2 @@[m
[32m+[m[32m/mvnw text eol=lf[m
[32m+[m[32m*.cmd text eol=crlf[m
[1mdiff --git a/parquimetro/bin/.gitignore b/parquimetro/bin/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..549e00a[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/.gitignore[m
[36m@@ -0,0 +1,33 @@[m
[32m+[m[32mHELP.md[m
[32m+[m[32mtarget/[m
[32m+[m[32m!.mvn/wrapper/maven-wrapper.jar[m
[32m+[m[32m!**/src/main/**/target/[m
[32m+[m[32m!**/src/test/**/target/[m
[32m+[m
[32m+[m[32m### STS ###[m
[32m+[m[32m.apt_generated[m
[32m+[m[32m.classpath[m
[32m+[m[32m.factorypath[m
[32m+[m[32m.project[m
[32m+[m[32m.settings[m
[32m+[m[32m.springBeans[m
[32m+[m[32m.sts4-cache[m
[32m+[m
[32m+[m[32m### IntelliJ IDEA ###[m
[32m+[m[32m.idea[m
[32m+[m[32m*.iws[m
[32m+[m[32m*.iml[m
[32m+[m[32m*.ipr[m
[32m+[m
[32m+[m[32m### NetBeans ###[m
[32m+[m[32m/nbproject/private/[m
[32m+[m[32m/nbbuild/[m
[32m+[m[32m/dist/[m
[32m+[m[32m/nbdist/[m
[32m+[m[32m/.nb-gradle/[m
[32m+[m[32mbuild/[m
[32m+[m[32m!**/src/main/**/build/[m
[32m+[m[32m!**/src/test/**/build/[m
[32m+[m
[32m+[m[32m### VS Code ###[m
[32m+[m[32m.vscode/[m
[1mdiff --git a/parquimetro/bin/.mvn/wrapper/maven-wrapper.properties b/parquimetro/bin/.mvn/wrapper/maven-wrapper.properties[m
[1mnew file mode 100644[m
[1mindex 0000000..d58dfb7[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/.mvn/wrapper/maven-wrapper.properties[m
[36m@@ -0,0 +1,19 @@[m
[32m+[m[32m# Licensed to the Apache Software Foundation (ASF) under one[m
[32m+[m[32m# or more contributor license agreements.  See the NOTICE file[m
[32m+[m[32m# distributed with this work for additional information[m
[32m+[m[32m# regarding copyright ownership.  The ASF licenses this file[m
[32m+[m[32m# to you under the Apache License, Version 2.0 (the[m
[32m+[m[32m# "License"); you may not use this file except in compliance[m
[32m+[m[32m# with the License.  You may obtain a copy of the License at[m
[32m+[m[32m#[m
[32m+[m[32m#   http://www.apache.org/licenses/LICENSE-2.0[m
[32m+[m[32m#[m
[32m+[m[32m# Unless required by applicable law or agreed to in writing,[m
[32m+[m[32m# software distributed under the License is distributed on an[m
[32m+[m[32m# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY[m
[32m+[m[32m# KIND, either express or implied.  See the License for the[m
[32m+[m[32m# specific language governing permissions and limitations[m
[32m+[m[32m# under the License.[m
[32m+[m[32mwrapperVersion=3.3.2[m
[32m+[m[32mdistributionType=only-script[m
[32m+[m[32mdistributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.9/apache-maven-3.9.9-bin.zip[m
[1mdiff --git a/parquimetro/bin/mvnw b/parquimetro/bin/mvnw[m
[1mnew file mode 100644[m
[1mindex 0000000..19529dd[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/mvnw[m
[36m@@ -0,0 +1,259 @@[m
[32m+[m[32m#!/bin/sh[m
[32m+[m[32m# ----------------------------------------------------------------------------[m
[32m+[m[32m# Licensed to the Apache Software Foundation (ASF) under one[m
[32m+[m[32m# or more contributor license agreements.  See the NOTICE file[m
[32m+[m[32m# distributed with this work for additional information[m
[32m+[m[32m# regarding copyright ownership.  The ASF licenses this file[m
[32m+[m[32m# to you under the Apache License, Version 2.0 (the[m
[32m+[m[32m# "License"); you may not use this file except in compliance[m
[32m+[m[32m# with the License.  You may obtain a copy of the License at[m
[32m+[m[32m#[m
[32m+[m[32m#    http://www.apache.org/licenses/LICENSE-2.0[m
[32m+[m[32m#[m
[32m+[m[32m# Unless required by applicable law or agreed to in writing,[m
[32m+[m[32m# software distributed under the License is distributed on an[m
[32m+[m[32m# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY[m
[32m+[m[32m# KIND, either express or implied.  See the License for the[m
[32m+[m[32m# specific language governing permissions and limitations[m
[32m+[m[32m# under the License.[m
[32m+[m[32m# ----------------------------------------------------------------------------[m
[32m+[m
[32m+[m[32m# ----------------------------------------------------------------------------[m
[32m+[m[32m# Apache Maven Wrapper startup batch script, version 3.3.2[m
[32m+[m[32m#[m
[32m+[m[32m# Optional ENV vars[m
[32m+[m[32m# -----------------[m
[32m+[m[32m#   JAVA_HOME - location of a JDK home dir, required when download maven via java source[m
[32m+[m[32m#   MVNW_REPOURL - repo url base for downloading maven distribution[m
[32m+[m[32m#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven[m
[32m+[m[32m#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output[m
[32m+[m[32m# ----------------------------------------------------------------------------[m
[32m+[m
[32m+[m[32mset -euf[m
[32m+[m[32m[ "${MVNW_VERBOSE-}" != debug ] || set -x[m
[32m+[m
[32m+[m[32m# OS specific support.[m
[32m+[m[32mnative_path() { printf %s\\n "$1"; }[m
[32m+[m[32mcase "$(uname)" in[m
[32m+[m[32mCYGWIN* | MINGW*)[m
[32m+[m[32m  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"[m
[32m+[m[32m  native_path() { cygpath --path --windows "$1"; }[m
[32m+[m[32m  ;;[m
[32m+[m[32mesac[m
[32m+[m
[32m+[m[32m# set JAVACMD and JAVACCMD[m
[32m+[m[32mset_java_home() {[m
[32m+[m[32m  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched[m
[32m+[m[32m  if [ -n "${JAVA_HOME-}" ]; then[m
[32m+[m[32m    if [ -x "$JAVA_HOME/jre/sh/java" ]; then[m
[32m+[m[32m      # IBM's JDK on AIX uses strange locations for the executables[m
[32m+[m[32m      JAVACMD="$JAVA_HOME/jre/sh/java"[m
[32m+[m[32m      JAVACCMD="$JAVA_HOME/jre/sh/javac"[m
[32m+[m[32m    else[m
[32m+[m[32m      JAVACMD="$JAVA_HOME/bin/java"[m
[32m+[m[32m      JAVACCMD="$JAVA_HOME/bin/javac"[m
[32m+[m
[32m+[m[32m      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then[m
[32m+[m[32m        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2[m
[32m+[m[32m        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2[m
[32m+[m[32m        return 1[m
[32m+[m[32m      fi[m
[32m+[m[32m    fi[m
[32m+[m[32m  else[m
[32m+[m[32m    JAVACMD="$([m
[32m+[m[32m      'set' +e[m
[32m+[m[32m      'unset' -f command 2>/dev/null[m
[32m+[m[32m      'command' -v java[m
[32m+[m[32m    )" || :[m
[32m+[m[32m    JAVACCMD="$([m
[32m+[m[32m      'set' +e[m
[32m+[m[32m      'unset' -f command 2>/dev/null[m
[32m+[m[32m      'command' -v javac[m
[32m+[m[32m    )" || :[m
[32m+[m
[32m+[m[32m    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then[m
[32m+[m[32m      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2[m
[32m+[m[32m      return 1[m
[32m+[m[32m    fi[m
[32m+[m[32m  fi[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# hash string like Java String::hashCode[m
[32m+[m[32mhash_string() {[m
[32m+[m[32m  str="${1:-}" h=0[m
[32m+[m[32m  while [ -n "$str" ]; do[m
[32m+[m[32m    char="${str%"${str#?}"}"[m
[32m+[m[32m    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))[m
[32m+[m[32m    str="${str#?}"[m
[32m+[m[32m  done[m
[32m+[m[32m  printf %x\\n $h[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mverbose() { :; }[m
[32m+[m[32m[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }[m
[32m+[m
[32m+[m[32mdie() {[m
[32m+[m[32m  printf %s\\n "$1" >&2[m
[32m+[m[32m  exit 1[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mtrim() {[m
[32m+[m[32m  # MWRAPPER-139:[m
[32m+[m[32m  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.[m
[32m+[m[32m  #   Needed for removing poorly interpreted newline sequences when running in more[m
[32m+[m[32m  #   exotic environments such as mingw bash on Windows.[m
[32m+[m[32m  printf "%s" "${1}" | tr -d '[:space:]'[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties[m
[32m+[m[32mwhile IFS="=" read -r key value; do[m
[32m+[m[32m  case "${key-}" in[m
[32m+[m[32m  distributionUrl) distributionUrl=$(trim "${value-}") ;;[m
[32m+[m[32m  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;[m
[32m+[m[32m  esac[m
[32m+[m[32mdone <"${0%/*}/.mvn/wrapper/maven-wrapper.properties"[m
[32m+[m[32m[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in ${0%/*}/.mvn/wrapper/maven-wrapper.properties"[m
[32m+[m
[32m+[m[32mcase "${distributionUrl##*/}" in[m
[32m+[m[32mmaven-mvnd-*bin.*)[m
[32m+[m[32m  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/[m
[32m+[m[32m  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in[m
[32m+[m[32m  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;[m
[32m+[m[32m  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;[m
[32m+[m[32m  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;[m
[32m+[m[32m  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;[m
[32m+[m[32m  *)[m
[32m+[m[32m    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2[m
[32m+[m[32m    distributionPlatform=linux-amd64[m
[32m+[m[32m    ;;[m
[32m+[m[32m  esac[m
[32m+[m[32m  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"[m
[32m+[m[32m  ;;[m
[32m+[m[32mmaven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;[m
[32m+[m[32m*) MVN_CMD="mvn${0##*/mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;[m
[32m+[m[32mesac[m
[32m+[m
[32m+[m[32m# apply MVNW_REPOURL and calculate MAVEN_HOME[m
[32m+[m[32m# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>[m
[32m+[m[32m[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"[m
[32m+[m[32mdistributionUrlName="${distributionUrl##*/}"[m
[32m+[m[32mdistributionUrlNameMain="${distributionUrlName%.*}"[m
[32m+[m[32mdistributionUrlNameMain="${distributionUrlNameMain%-bin}"[m
[32m+[m[32mMAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"[m
[32m+[m[32mMAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"[m
[32m+[m
[32m+[m[32mexec_maven() {[m
[32m+[m[32m  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :[m
[32m+[m[32m  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mif [ -d "$MAVEN_HOME" ]; then[m
[32m+[m[32m  verbose "found existing MAVEN_HOME at $MAVEN_HOME"[m
[32m+[m[32m  exec_maven "$@"[m
[32m+[m[32mfi[m
[32m+[m
[32m+[m[32mcase "${distributionUrl-}" in[m
[32m+[m[32m*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;[m
[32m+[m[32m*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;[m
[32m+[m[32mesac[m
[32m+[m
[32m+[m[32m# prepare tmp dir[m
[32m+[m[32mif TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then[m
[32m+[m[32m  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }[m
[32m+[m[32m  trap clean HUP INT TERM EXIT[m
[32m+[m[32melse[m
[32m+[m[32m  die "cannot create temp dir"[m
[32m+[m[32mfi[m
[32m+[m
[32m+[m[32mmkdir -p -- "${MAVEN_HOME%/*}"[m
[32m+[m
[32m+[m[32m# Download and Install Apache Maven[m
[32m+[m[32mverbose "Couldn't find MAVEN_HOME, downloading and installing it ..."[m
[32m+[m[32mverbose "Downloading from: $distributionUrl"[m
[32m+[m[32mverbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"[m
[32m+[m
[32m+[m[32m# select .zip or .tar.gz[m
[32m+[m[32mif ! command -v unzip >/dev/null; then[m
[32m+[m[32m  distributionUrl="${distributionUrl%.zip}.tar.gz"[m
[32m+[m[32m  distributionUrlName="${distributionUrl##*/}"[m
[32m+[m[32mfi[m
[32m+[m
[32m+[m[32m# verbose opt[m
[32m+[m[32m__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''[m
[32m+[m[32m[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v[m
[32m+[m
[32m+[m[32m# normalize http auth[m
[32m+[m[32mcase "${MVNW_PASSWORD:+has-password}" in[m
[32m+[m[32m'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;[m
[32m+[m[32mhas-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;[m
[32m+[m[32mesac[m
[32m+[m
[32m+[m[32mif [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then[m
[32m+[m[32m  verbose "Found wget ... using wget"[m
[32m+[m[32m  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"[m
[32m+[m[32melif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then[m
[32m+[m[32m  verbose "Found curl ... using curl"[m
[32m+[m[32m  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"[m
[32m+[m[32melif set_java_home; then[m
[32m+[m[32m  verbose "Falling back to use Java to download"[m
[32m+[m[32m  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"[m
[32m+[m[32m  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"[m
[32m+[m[32m  cat >"$javaSource" <<-END[m
[32m+[m	[32mpublic class Downloader extends java.net.Authenticator[m
[32m+[m	[32m{[m
[32m+[m	[32m  protected java.net.PasswordAuthentication getPasswordAuthentication()[m
[32m+[m	[32m  {[m
[32m+[m	[32m    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );[m
[32m+[m	[32m  }[m
[32m+[m	[32m  public static void main( String[] args ) throws Exception[m
[32m+[m	[32m  {[m
[32m+[m	[32m    setDefault( new Downloader() );[m
[32m+[m	[32m    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );[m
[32m+[m	[32m  }[m
[32m+[m	[32m}[m
[32m+[m	[32mEND[m
[32m+[m[32m  # For Cygwin/MinGW, switch paths to Windows format before running javac and java[m
[32m+[m[32m  verbose " - Compiling Downloader.java ..."[m
[32m+[m[32m  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"[m
[32m+[m[32m  verbose " - Running Downloader.java ..."[m
[32m+[m[32m  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"[m
[32m+[m[32mfi[m
[32m+[m
[32m+[m[32m# If specified, validate the SHA-256 sum of the Maven distribution zip file[m
[32m+[m[32mif [ -n "${distributionSha256Sum-}" ]; then[m
[32m+[m[32m  distributionSha256Result=false[m
[32m+[m[32m  if [ "$MVN_CMD" = mvnd.sh ]; then[m
[32m+[m[32m    echo "Checksum validation is not supported for maven-mvnd." >&2[m
[32m+[m[32m    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2[m
[32m+[m[32m    exit 1[m
[32m+[m[32m  elif command -v sha256sum >/dev/null; then[m
[32m+[m[32m    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c >/dev/null 2>&1; then[m
[32m+[m[32m      distributionSha256Result=true[m
[32m+[m[32m    fi[m
[32m+[m[32m  elif command -v shasum >/dev/null; then[m
[32m+[m[32m    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then[m
[32m+[m[32m      distributionSha256Result=true[m
[32m+[m[32m    fi[m
[32m+[m[32m  else[m
[32m+[m[32m    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2[m
[32m+[m[32m    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2[m
[32m+[m[32m    exit 1[m
[32m+[m[32m  fi[m
[32m+[m[32m  if [ $distributionSha256Result = false ]; then[m
[32m+[m[32m    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2[m
[32m+[m[32m    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2[m
[32m+[m[32m    exit 1[m
[32m+[m[32m  fi[m
[32m+[m[32mfi[m
[32m+[m
[32m+[m[32m# unzip and move[m
[32m+[m[32mif command -v unzip >/dev/null; then[m
[32m+[m[32m  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"[m
[32m+[m[32melse[m
[32m+[m[32m  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"[m
[32m+[m[32mfi[m
[32m+[m[32mprintf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/mvnw.url"[m
[32m+[m[32mmv -- "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"[m
[32m+[m
[32m+[m[32mclean || :[m
[32m+[m[32mexec_maven "$@"[m
[1mdiff --git a/parquimetro/bin/mvnw.cmd b/parquimetro/bin/mvnw.cmd[m
[1mnew file mode 100644[m
[1mindex 0000000..249bdf3[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/mvnw.cmd[m
[36m@@ -0,0 +1,149 @@[m
[32m+[m[32m<# : batch portion[m
[32m+[m[32m@REM ----------------------------------------------------------------------------[m
[32m+[m[32m@REM Licensed to the Apache Software Foundation (ASF) under one[m
[32m+[m[32m@REM or more contributor license agreements.  See the NOTICE file[m
[32m+[m[32m@REM distributed with this work for additional information[m
[32m+[m[32m@REM regarding copyright ownership.  The ASF licenses this file[m
[32m+[m[32m@REM to you under the Apache License, Version 2.0 (the[m
[32m+[m[32m@REM "License"); you may not use this file except in compliance[m
[32m+[m[32m@REM with the License.  You may obtain a copy of the License at[m
[32m+[m[32m@REM[m
[32m+[m[32m@REM    http://www.apache.org/licenses/LICENSE-2.0[m
[32m+[m[32m@REM[m
[32m+[m[32m@REM Unless required by applicable law or agreed to in writing,[m
[32m+[m[32m@REM software distributed under the License is distributed on an[m
[32m+[m[32m@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY[m
[32m+[m[32m@REM KIND, either express or implied.  See the License for the[m
[32m+[m[32m@REM specific language governing permissions and limitations[m
[32m+[m[32m@REM under the License.[m
[32m+[m[32m@REM ----------------------------------------------------------------------------[m
[32m+[m
[32m+[m[32m@REM ----------------------------------------------------------------------------[m
[32m+[m[32m@REM Apache Maven Wrapper startup batch script, version 3.3.2[m
[32m+[m[32m@REM[m
[32m+[m[32m@REM Optional ENV vars[m
[32m+[m[32m@REM   MVNW_REPOURL - repo url base for downloading maven distribution[m
[32m+[m[32m@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven[m
[32m+[m[32m@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output[m
[32m+[m[32m@REM ----------------------------------------------------------------------------[m
[32m+[m
[32m+[m[32m@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)[m
[32m+[m[32m@SET __MVNW_CMD__=[m
[32m+[m[32m@SET __MVNW_ERROR__=[m
[32m+[m[32m@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%[m
[32m+[m[32m@SET PSModulePath=[m
[32m+[m[32m@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @([m
[32m+[m[32m  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)[m
[32m+[m[32m)[m
[32m+[m[32m@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%[m
[32m+[m[32m@SET __MVNW_PSMODULEP_SAVE=[m
[32m+[m[32m@SET __MVNW_ARG0_NAME__=[m
[32m+[m[32m@SET MVNW_USERNAME=[m
[32m+[m[32m@SET MVNW_PASSWORD=[m
[32m+[m[32m@IF NOT "%__MVNW_CMD__%"=="" (%__MVNW_CMD__% %*)[m
[32m+[m[32m@echo Cannot start maven from wrapper >&2 && exit /b 1[m
[32m+[m[32m@GOTO :EOF[m
[32m+[m[32m: end batch / begin powershell #>[m
[32m+[m
[32m+[m[32m$ErrorActionPreference = "Stop"[m
[32m+[m[32mif ($env:MVNW_VERBOSE -eq "true") {[m
[32m+[m[32m  $VerbosePreference = "Continue"[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties[m
[32m+[m[32m$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl[m
[32m+[m[32mif (!$distributionUrl) {[m
[32m+[m[32m  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mswitch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {[m
[32m+[m[32m  "maven-mvnd-*" {[m
[32m+[m[32m    $USE_MVND = $true[m
[32m+[m[32m    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"[m
[32m+[m[32m    $MVN_CMD = "mvnd.cmd"[m
[32m+[m[32m    break[m
[32m+[m[32m  }[m
[32m+[m[32m  default {[m
[32m+[m[32m    $USE_MVND = $false[m
[32m+[m[32m    $MVN_CMD = $script -replace '^mvnw','mvn'[m
[32m+[m[32m    break[m
[32m+[m[32m  }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# apply MVNW_REPOURL and calculate MAVEN_HOME[m
[32m+[m[32m# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>[m
[32m+[m[32mif ($env:MVNW_REPOURL) {[m
[32m+[m[32m  $MVNW_REPO_PATTERN = if ($USE_MVND) { "/org/apache/maven/" } else { "/maven/mvnd/" }[m
[32m+[m[32m  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace '^.*'+$MVNW_REPO_PATTERN,'')"[m
[32m+[m[32m}[m
[32m+[m[32m$distributionUrlName = $distributionUrl -replace '^.*/',''[m
[32m+[m[32m$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''[m
[32m+[m[32m$MAVEN_HOME_PARENT = "$HOME/.m2/wrapper/dists/$distributionUrlNameMain"[m
[32m+[m[32mif ($env:MAVEN_USER_HOME) {[m
[32m+[m[32m  $MAVEN_HOME_PARENT = "$env:MAVEN_USER_HOME/wrapper/dists/$distributionUrlNameMain"[m
[32m+[m[32m}[m
[32m+[m[32m$MAVEN_HOME_NAME = ([System.Security.Cryptography.MD5]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''[m
[32m+[m[32m$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"[m
[32m+[m
[32m+[m[32mif (Test-Path -Path "$MAVEN_HOME" -PathType Container) {[m
[32m+[m[32m  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"[m
[32m+[m[32m  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"[m
[32m+[m[32m  exit $?[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mif (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {[m
[32m+[m[32m  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# prepare tmp dir[m
[32m+[m[32m$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile[m
[32m+[m[32m$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"[m
[32m+[m[32m$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null[m
[32m+[m[32mtrap {[m
[32m+[m[32m  if ($TMP_DOWNLOAD_DIR.Exists) {[m
[32m+[m[32m    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }[m
[32m+[m[32m    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }[m
[32m+[m[32m  }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mNew-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null[m
[32m+[m
[32m+[m[32m# Download and Install Apache Maven[m
[32m+[m[32mWrite-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."[m
[32m+[m[32mWrite-Verbose "Downloading from: $distributionUrl"[m
[32m+[m[32mWrite-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"[m
[32m+[m
[32m+[m[32m$webclient = New-Object System.Net.WebClient[m
[32m+[m[32mif ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {[m
[32m+[m[32m  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)[m
[32m+[m[32m}[m
[32m+[m[32m[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12[m
[32m+[m[32m$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null[m
[32m+[m
[32m+[m[32m# If specified, validate the SHA-256 sum of the Maven distribution zip file[m
[32m+[m[32m$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum[m
[32m+[m[32mif ($distributionSha256Sum) {[m
[32m+[m[32m  if ($USE_MVND) {[m
[32m+[m[32m    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."[m
[32m+[m[32m  }[m
[32m+[m[32m  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash[m
[32m+[m[32m  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {[m
[32m+[m[32m    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."[m
[32m+[m[32m  }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m# unzip and move[m
[32m+[m[32mExpand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null[m
[32m+[m[32mRename-Item -Path "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" -NewName $MAVEN_HOME_NAME | Out-Null[m
[32m+[m[32mtry {[m
[32m+[m[32m  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null[m
[32m+[m[32m} catch {[m
[32m+[m[32m  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {[m
[32m+[m[32m    Write-Error "fail to move MAVEN_HOME"[m
[32m+[m[32m  }[m
[32m+[m[32m} finally {[m
[32m+[m[32m  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }[m
[32m+[m[32m  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mWrite-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"[m
[1mdiff --git a/parquimetro/bin/pom.xml b/parquimetro/bin/pom.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..52dd2ad[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/pom.xml[m
[36m@@ -0,0 +1,89 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
[32m+[m	[32mxsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[32m+[m	[32m<modelVersion>4.0.0</modelVersion>[m
[32m+[m	[32m<parent>[m
[32m+[m		[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m		[32m<artifactId>spring-boot-starter-parent</artifactId>[m
[32m+[m		[32m<version>3.4.1</version>[m
[32m+[m		[32m<relativePath/> <!-- lookup parent from repository -->[m
[32m+[m	[32m</parent>[m
[32m+[m	[32m<groupId>com.fiap</groupId>[m
[32m+[m	[32m<artifactId>parquimetro</artifactId>[m
[32m+[m	[32m<version>0.0.1-SNAPSHOT</version>[m
[32m+[m	[32m<name>parquimetro</name>[m
[32m+[m	[32m<description>Solução para parquímetros</description>[m
[32m+[m	[32m<url/>[m
[32m+[m	[32m<licenses>[m
[32m+[m		[32m<license/>[m
[32m+[m	[32m</licenses>[m
[32m+[m	[32m<developers>[m
[32m+[m		[32m<developer/>[m
[32m+[m	[32m</developers>[m
[32m+[m	[32m<scm>[m
[32m+[m		[32m<connection/>[m
[32m+[m		[32m<developerConnection/>[m
[32m+[m		[32m<tag/>[m
[32m+[m		[32m<url/>[m
[32m+[m	[32m</scm>[m
[32m+[m	[32m<properties>[m
[32m+[m		[32m<java.version>17</java.version>[m
[32m+[m	[32m</properties>[m
[32m+[m	[32m<dependencies>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m			[32m<artifactId>spring-boot-starter-data-mongodb</artifactId>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m			[32m<artifactId>spring-boot-starter-web</artifactId>[m
[32m+[m		[32m</dependency>[m
[32m+[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m			[32m<artifactId>spring-boot-devtools</artifactId>[m
[32m+[m			[32m<scope>runtime</scope>[m
[32m+[m			[32m<optional>true</optional>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.projectlombok</groupId>[m
[32m+[m			[32m<artifactId>lombok</artifactId>[m
[32m+[m			[32m<optional>true</optional>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m			[32m<artifactId>spring-boot-starter-test</artifactId>[m
[32m+[m			[32m<scope>test</scope>[m
[32m+[m		[32m</dependency>[m
[32m+[m	[32m</dependencies>[m
[32m+[m
[32m+[m	[32m<build>[m
[32m+[m		[32m<plugins>[m
[32m+[m			[32m<plugin>[m
[32m+[m				[32m<groupId>org.apache.maven.plugins</groupId>[m
[32m+[m				[32m<artifactId>maven-compiler-plugin</artifactId>[m
[32m+[m				[32m<configuration>[m
[32m+[m					[32m<annotationProcessorPaths>[m
[32m+[m						[32m<path>[m
[32m+[m							[32m<groupId>org.projectlombok</groupId>[m
[32m+[m							[32m<artifactId>lombok</artifactId>[m
[32m+[m						[32m</path>[m
[32m+[m					[32m</annotationProcessorPaths>[m
[32m+[m				[32m</configuration>[m
[32m+[m			[32m</plugin>[m
[32m+[m			[32m<plugin>[m
[32m+[m				[32m<groupId>org.springframework.boot</groupId>[m
[32m+[m				[32m<artifactId>spring-boot-maven-plugin</artifactId>[m
[32m+[m				[32m<configuration>[m
[32m+[m					[32m<excludes>[m
[32m+[m						[32m<exclude>[m
[32m+[m							[32m<groupId>org.projectlombok</groupId>[m
[32m+[m							[32m<artifactId>lombok</artifactId>[m
[32m+[m						[32m</exclude>[m
[32m+[m					[32m</excludes>[m
[32m+[m				[32m</configuration>[m
[32m+[m			[32m</plugin>[m
[32m+[m		[32m</plugins>[m
[32m+[m	[32m</build>[m
[32m+[m
[32m+[m[32m</project>[m
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/ParquimetroApplication.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/ParquimetroApplication.class[m
[1mnew file mode 100644[m
[1mindex 0000000..37c532b[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/ParquimetroApplication.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/ReservaController.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/ReservaController.class[m
[1mnew file mode 100644[m
[1mindex 0000000..fc03a74[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/ReservaController.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/VagaController.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/VagaController.class[m
[1mnew file mode 100644[m
[1mindex 0000000..7af1cf1[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/controller/VagaController.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Reserva.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Reserva.class[m
[1mnew file mode 100644[m
[1mindex 0000000..8f49218[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Reserva.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Vaga.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Vaga.class[m
[1mnew file mode 100644[m
[1mindex 0000000..003a0d7[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Vaga.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Valor.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Valor.class[m
[1mnew file mode 100644[m
[1mindex 0000000..68fcc46[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/model/Valor.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/PessoaRepository.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/PessoaRepository.class[m
[1mnew file mode 100644[m
[1mindex 0000000..3ccec78[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/PessoaRepository.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/ReservaRepository.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/ReservaRepository.class[m
[1mnew file mode 100644[m
[1mindex 0000000..58bbaee[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/ReservaRepository.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/VagaRepository.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/VagaRepository.class[m
[1mnew file mode 100644[m
[1mindex 0000000..ce9893c[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/repository/VagaRepository.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/ReservaService.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/ReservaService.class[m
[1mnew file mode 100644[m
[1mindex 0000000..fd4efb4[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/ReservaService.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/VagaService.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/VagaService.class[m
[1mnew file mode 100644[m
[1mindex 0000000..b046d81[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/VagaService.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/ReservaServiceImpl.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/ReservaServiceImpl.class[m
[1mnew file mode 100644[m
[1mindex 0000000..fba2a25[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/ReservaServiceImpl.class differ
[1mdiff --git a/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/VagaServiceImpl.class b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/VagaServiceImpl.class[m
[1mnew file mode 100644[m
[1mindex 0000000..413a371[m
Binary files /dev/null and b/parquimetro/bin/src/main/java/com/fiap/parquimetro/service/impl/VagaServiceImpl.class differ
[1mdiff --git a/parquimetro/bin/src/main/resources/application.properties b/parquimetro/bin/src/main/resources/application.properties[m
[1mnew file mode 100644[m
[1mindex 0000000..c772710[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/src/main/resources/application.properties[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mspring.application.name=parquimetro[m
[32m+[m[32mspring.data.mongodb.host=localhost[m
[32m+[m[32mspring.data.mongodb.port=27017[m
[32m+[m[32mspring.data.mongodb.database=parquimetro[m
[1mdiff --git a/parquimetro/bin/src/main/resources/static/js/parquimetro_db.js b/parquimetro/bin/src/main/resources/static/js/parquimetro_db.js[m
[1mnew file mode 100644[m
[1mindex 0000000..9c33db5[m
[1m--- /dev/null[m
[1m+++ b/parquimetro/bin/src/main/resources/static/js/parquimetro_db.js[m
[36m@@ -0,0 +1,78 @@[m
[32m+[m[32mconst dbName = "parquimetro";[m
[32m+[m[32mconst db = db.getSiblingDB(dbName);[m
[32m+[m
[32m+[m[32mdb.createCollection("Usuarios");[m
[32m+[m[32mdb.createCollection("Reserva");[m
[32m+[m[32mdb.createCollection("Regiao");[m
[32m+[m[32mdb.createCollection("Vaga");[m
[32m+[m[32mdb.createCollection("Fiscal");[m
[32m+[m
[32m+[m[32m// Dados dummy[m
[32m+[m[32mdb.Usuarios.insertMany([[m
[32m+[m[32m  {[m
[32m+[m[32m    nome: "João Silva",[m
[32m+[m[32m    cpf: "12345678900",[m
[32m+[m[32m    email: "joao.silva@example.com",[m
[32m+[m[32m    numeroCelular: "11987654321",[m
[32m+[m[32m    placasCarro: ["ABC1234"],[m
[32m+[m[32m    preferencias: { notificacoesAtivas: true },[m
[32m+[m[32m    dataCriacao: new Date(),[m
[32m+[m[32m    dataUltimaAtualizacao: new Date(),[m
[32m+[m[32m  }[m
[32m+[m[32m]);[m
[32m+[m
[32m+[m[32mdb.Reserva.insertMany([[m
[32m+[m[32m  {[m
[32m+[m[32m    tempoSolicitadoMinutos: 60,[m
[32m+[m[32m    horarioInicio: new Date(),[m
[32m+[m[32m    horarioFimEstimado: new Date(new Date().getTime() + 60 * 60 * 1000),[m
[32m+[m[32m    horarioFimReal: null,[m
[32m+[m[32m    tempoUsadoMinutos: null,[m
[32m+[m[32m    valorPago: { valor: NumberDecimal("5.00"), moeda: "BRL" },[m
[32m+[m[32m    status: "Ativa",[m
[32m+[m[32m    dataCriacao: new Date(),[m
[32m+[m[32m    dataUltimaAtualizacao: new Date(),[m
[32m+[m[32m    usuarioId: ObjectId(),[m
[32m+[m[32m    usuario: { nome: "João Silva", cpf: "12345678900", placaCarro: "ABC1234" },[m
[32m+[m[32m    vagaId: ObjectId(),[m
[32m+[m[32m    vaga: { numero: 10 },[m
[32m+[m[32m    regiaoId: ObjectId(),[m
[32m+[m[32m    regiao: { nome: "Centro", tarifaPorMinuto: { valor: NumberDecimal("0.10"), moeda: "BRL" } }[m
[32m+[m[32m  }[m
[32m+[m[32m]);[m
[32m+[m
[32m+[m[32mdb.Regiao.insertMany([[m
[32m+[m[32m  {[m
[32m+[m[32m    nome: "Centro",[m
[32m+[m[32m    descricao: "Região central da cidade",[m
[32m+[m[32m    zona: "A",[m
[32m+[m[32m    tarifaPorMinuto: { valor: NumberDecimal("0.10"), moeda: "BRL" },[m
[32m+[m[32m    tempoToleranciaMinutos: 5,[m
[32m+[m[32m    dataCriacao: new Date(),[m
[32m+[m[32m    dataUltimaAtualizacao: new Date(),[m
[32m+[m[32m  }[m
[32m+[m[32m]);[m
[32m+[m
[32m+[m[32mdb.Vaga.insertMany([[m
[32m+[m[32m  {[m
[32m+[m[32m    regiaoId: ObjectId(),[m
[32m+[m[32m    numero: 10,[m
[32m+[m[32m    disponivel: true,[m
[32m+[m[32m    localizacao: { latitude: -23.563210, longitude: -46.654321 },[m
[32m+[m[32m    dataCriacao: new Date(),[m
[32m+[m[32m    dataUltimaAtualizacao: new Date(),[m
[32m+[m[32m  }[m
[32m+[m[32m]);[m
[32m+[m
[32m+[m[32mdb.Fiscal.insertMany([[m
[32m+[m[32m  {[m
[32m+[m[32m    nome: "Admin Fiscal",[m
[32m+[m[32m    cnpj: "12345678000199",[m
[32m+[m[32m    email: "fiscal@example.com",[m
[32m+[m[32m    numeroCelular: "11912345678",[m
[32m+[m[32m    dataCriacao: new Date(),[m
[32m+[m[32m    dataUltimaAtualizacao: new Date(),[m
[32m+[m[32m  }[m
[32m+[m[32m]);[m
[32m+[m
[32m+[m[32mprint(`Banco de dados '${dbName}' e collections criados com sucesso!`);[m
[1mdiff --git a/parquimetro/bin/src/test/java/com/fiap/parquimetro/ParquimetroApplicationTests.class b/parquimetro/bin/src/test/java/com/fiap/parquimetro/ParquimetroApplicationTests.class[m
[1mnew file mode 100644[m
[1mindex 0000000..e04a9ff[m
Binary files /dev/null and b/parquimetro/bin/src/test/java/com/fiap/parquimetro/ParquimetroApplicationTests.class differ
[1mdiff --git a/parquimetro/src/main/java/com/fiap/parquimetro/model/Pessoa.java b/parquimetro/src/main/java/com/fiap/parquimetro/model/Pessoa.java[m
[1mindex e69de29..011bba9 100644[m
[1m--- a/parquimetro/src/main/java/com/fiap/parquimetro/model/Pessoa.java[m
[1m+++ b/parquimetro/src/main/java/com/fiap/parquimetro/model/Pessoa.java[m
[36m@@ -0,0 +1,111 @@[m
[32m+[m[32mpackage com.fiap.parquimetro.model;[m
[32m+[m
[32m+[m[32mimport org.springframework.data.mongodb.core.mapping.Document;[m
[32m+[m
[32m+[m[32mimport java.time.LocalDateTime;[m
[32m+[m[32mimport java.util.List;[m
[32m+[m
[32m+[m[32m@Document(collection = "pessoas")[m[41m [m
[32m+[m[32mpublic class Pessoa {[m
[32m+[m
[32m+[m
[32m+[m[32m    private String cpf;[m
[32m+[m[32m    private String nome;[m
[32m+[m[32m    private String email;[m
[32m+[m[32m    private String placa;[m
[32m+[m[32m    private String numeroCelular;[m
[32m+[m[32m    private List<String> placasCarro;[m
[32m+[m[32m    private LocalDateTime dataCriacao;[m
[32m+[m[32m    private LocalDateTime dataUltimaAtualizacao;[m
[32m+[m[32m    private Preferencias preferencias;[m
[32m+[m
[32m+[m[32m    public Pessoa(String cpf, String nome, String email, String placa, String numeroCelular,[m
[32m+[m[32m                  List<String> placasCarro, Preferencias preferencias) {[m
[32m+[m[32m        this.cpf = cpf;[m
[32m+[m[32m        this.nome = nome;[m
[32m+[m[32m        this.email = email;[m
[32m+[m[32m        this.placa = placa;[m
[32m+[m[32m        this.numeroCelular = numeroCelular;[m
[32m+[m[32m        this.placasCarro = placasCarro;[m
[32m+[m[32m        this.dataCriacao = LocalDateTime.now();[m
[32m+[m[32m        this.dataUltimaAtualizacao = LocalDateTime.now();[m
[32m+[m[32m        this.preferencias = preferencias;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getCpf() {[m
[32m+[m[32m        return cpf;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setCpf(String cpf) {[m
[32m+[m[32m        this.cpf = cpf;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getNome() {[m
[32m+[m[32m        return nome;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setNome(String nome) {[m
[32m+[m[32m        this.nome = nome;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getEmail() {[m
[32m+[m[32m        return email;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setEmail(String email) {[m
[32m+[m[32m        this.email = email;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getPlaca() {[m
[32m+[m[32m        return placa;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setPlaca(String placa) {[m
[32m+[m[32m        this.placa = placa;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getNumeroCelular() {[m
[32m+[m[32m        return numeroCelular;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setNumeroCelular(String numeroCelular) {[m
[32m+[m[32m        this.numeroCelular = numeroCelular;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public List<String> getPlacasCarro() {[m
[32m+[m[32m        return placasCarro;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setPlacasCarro(List<String> placasCarro) {[m
[32m+[m[32m        this.placasCarro = placasCarro;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public LocalDateTime getDataCriacao() {[m
[32m+[m[32m        return dataCriacao;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setDataCriacao(LocalDateTime dataCriacao) {[m
[32m+[m[32m        this.dataCriacao = dataCriacao;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public LocalDateTime getDataUltimaAtualizacao() {[m
[32m+[m[32m        return dataUltimaAtualizacao;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {[m
[32m+[m[32m        this.dataUltimaAtualizacao = dataUltimaAtualizacao;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public Preferencias getPreferencias() {[m
[32m+[m[32m        return preferencias;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setPreferencias(Preferencias preferencias) {[m
[32m+[m[32m        this.preferencias = preferencias;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void atualizar() {[m
[32m+[m[32m        this.dataUltimaAtualizacao = LocalDateTime.now();[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m}[m
\ No newline at end of file[m
[1mdiff --git a/parquimetro/src/main/java/com/fiap/parquimetro/model/Preferencias.java b/parquimetro/src/main/java/com/fiap/parquimetro/model/Preferencias.java[m
[1mindex e69de29..d5ed1ae 100644[m
[1m--- a/parquimetro/src/main/java/com/fiap/parquimetro/model/Preferencias.java[m
[1m+++ b/parquimetro/src/main/java/com/fiap/parquimetro/model/Preferencias.java[m
[36m@@ -0,0 +1,36 @@[m
[32m+[m[32mpackage com.fiap.parquimetro.model;[m
[32m+[m
[32m+[m[32mpublic class Preferencias {[m
[32m+[m
[32m+[m[32m    private boolean notificacoes;[m
[32m+[m[32m    private boolean avisoAntesDeFimDeReserva;[m
[32m+[m
[32m+[m[32m    public Preferencias(boolean notificacoes, boolean avisoAntesDeFimDeReserva) {[m
[32m+[m[32m        this.notificacoes = notificacoes;[m
[32m+[m[32m        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public boolean isNotificacoes() {[m
[32m+[m[32m        return notificacoes;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setNotificacoes(boolean notificacoes) {[m
[32m+[m[32m        this.notificacoes = notificacoes;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public boolean isAvisoAntesDeFimDeReserva() {[m
[32m+[m[32m        return avisoAntesDeFimDeReserva;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setAvisoAntesDeFimDeReserva(boolean avisoAntesDeFimDeReserva) {[m
[32m+[m[32m        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @Override[m
[32m+[m[32m    public String toString() {[m
[32m+[m[32m        return "Preferencias{" +[m
[32m+[m[32m               "notificacoes=" + notificacoes +[m
[32m+[m[32m               ", avisoAntesDeFimDeReserva=" + avisoAntesDeFimDeReserva +[m
[32m+[m[32m               '}';[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/postech-parquimetro b/postech-parquimetro[m
[1mnew file mode 160000[m
[1mindex 0000000..f4983d5[m
[1m--- /dev/null[m
[1m+++ b/postech-parquimetro[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32mSubproject commit f4983d513d6f5d8bf8532421942a62f019077ab8[m
